package com.example.authcenter.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * department_user_relation
 *
 * @author xujw
 * @since 2020-5-23 11:01:00
 */
@Data
public class DepartmentUserRelation implements Serializable {
    /**
     * 用户id主键
     */
    private String uid;

    /**
     * 部门id
     */
    private Long departmentId;

    /**
     * 状态定义
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}