package com.ghh.api.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:28 2020/11/18
 * @Modified By:
 */
@Data
@Accessors(chain = true) // 对象可以连续set属性值
public class Dept implements Serializable {
    private long deptno;
    private String dname;
    private String dbSource;
}
