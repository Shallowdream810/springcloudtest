package com.ghh.api.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:28 2020/11/18
 * @Modified By:
 */
@Data
public class Dept implements Serializable {
    private long deptno;
    private String dname;
    private String db_source;
}
