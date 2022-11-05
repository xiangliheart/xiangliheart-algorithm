/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.platform.workflow;

import org.activiti.api.process.model.ProcessDefinition;
import org.activiti.api.process.model.ProcessInstance;
import org.activiti.api.process.model.builders.ProcessPayloadBuilder;
import org.activiti.api.process.runtime.ProcessRuntime;
import org.activiti.api.runtime.shared.query.Page;
import org.activiti.api.runtime.shared.query.Pageable;
import org.activiti.api.task.model.Task;
import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.activiti.engine.RepositoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xiangliheart.eob.platform.workflow.utils.SecurityUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * EobPlatformWorkflowApplicationTest
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/9/13
 */
@Slf4j
@SpringBootTest
public class EobPlatformWorkflowApplicationTest {
    @Autowired
    private ProcessRuntime processRuntime;
    @Autowired
    private TaskRuntime taskRuntime;
    @Autowired
    private SecurityUtil securityUtil;
    @Autowired
    private RepositoryService repositoryService;

    /**
     * testContextLoads 加载流程引擎，生成Activiti的相关的表结构
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/13
     */
    @Test
    void testContextLoads() {
        log.info(taskRuntime.toString());
    }

    /**
     * testQueryProcessDefinitions 测试查询流程的定义
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/13
     */
    @Test
    public void testQueryProcessDefinitions() {
        securityUtil.logInAs("system");
        Page<ProcessDefinition> processDefinitionPage = processRuntime.processDefinitions(Pageable.of(0, 10));
        log.info("可用的流程定义数量:" + processDefinitionPage.getTotalItems());
        for (ProcessDefinition processDefinition : processDefinitionPage.getContent()) {
            log.info("流程定义：" + processDefinition);
        }
    }

    /**
     * testDeployProcess 测试部署流程
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/13
     */
    @Test
    public void testDeployProcess() {
        repositoryService.createDeployment().addClasspathResource("bpmn/LeaveProcess.bpmn")
            .addClasspathResource("bpmn/LeaveProcess.png").name("请假申请单").deploy();
    }

    /**
     * testBuildProcessInstance 测试启动流程实例
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/13
     */
    @Test
    public void testBuildProcessInstance() {
        securityUtil.logInAs("system");
        ProcessInstance processInstance =
            processRuntime.start(ProcessPayloadBuilder.start().withProcessDefinitionKey("LeaveProcess").build());
        log.info("流程实例id:" + processInstance.getId());
    }

    /**
     * testQueryClaimCompleteTask 测试任务查询、拾取及完成操作
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/13
     */
    @Test
    public void testQueryClaimCompleteTask() {
        securityUtil.logInAs("jack");
        Page<Task> tasks = taskRuntime.tasks(Pageable.of(0, 10));
        if (tasks != null && tasks.getTotalItems() > 0) {
            for (Task task : tasks.getContent()) {
                // 拾取任务
                taskRuntime.claim(TaskPayloadBuilder.claim().withTaskId(task.getId()).build());
                log.info("任务：" + task);
                taskRuntime.complete(TaskPayloadBuilder.complete().withTaskId(task.getId()).build());
            }
        }
        Page<Task> taskPage = taskRuntime.tasks(Pageable.of(0, 10));
        if (taskPage.getTotalItems() > 0) {
            log.info("任务：" + taskPage.getContent());
        }
    }
}
