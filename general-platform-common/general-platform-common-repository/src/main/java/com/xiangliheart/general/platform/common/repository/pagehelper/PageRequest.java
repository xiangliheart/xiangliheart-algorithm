/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.common.repository.pagehelper;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * PageRequest 分页请求
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/9
 */
@Data
@ApiModel
public class PageRequest {
    private int pageNum;

    private int pageSize;
}
