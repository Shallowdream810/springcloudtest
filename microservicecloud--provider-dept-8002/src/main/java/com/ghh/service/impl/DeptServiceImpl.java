package com.ghh.service.impl;

import com.ghh.api.entity.Dept;
import com.ghh.dao.DeptDao;
import com.ghh.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 22:58 2020/11/18
 * @Modified By:
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        boolean b = deptDao.addDept(dept);
        return b;
    }

    @Override
    public Dept get(Long id) {

        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
