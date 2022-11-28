/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.common.web.utils;

import java.io.IOException;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiangliheart.modules.common.web.http.HttpResult;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * HttpUtils HTTP工具类
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/20
 */
public class HttpUtils {

    /**
     * getHttpServletRequest 获取HttpServletRequest对象
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/20
     */
    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * write 输出信息到浏览器
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/20
     */
    public static void write(HttpServletResponse response, Object data) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        HttpResult result = HttpResult.ok(data);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(result);
        response.getWriter().print(json);
        response.getWriter().flush();
        response.getWriter().close();
    }
}
