package com.xiangliheart.general.platform.common.repository.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;

public interface CrudService <T>{

    int save(T record);

    int saveList(List<T> records);

    int delete(T record);

    int update(T record);

    T findById(String id);

    PageInfo findPage(PageRequest pageRequest);
}
