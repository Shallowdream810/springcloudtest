package com.ghh.service;

import com.ghh.api.entity.Dept;

import java.util.List;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 22:51 2020/11/18
 * @Modified By:
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
