package com.example.authcenter.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * sys_permission
 *
 * @author xujw
 * @since 2020-5-23 11:01:00
 */
@Data
public class SysPermission implements Serializable {
    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 描述说明
     */
    private String description;

    /**
     * 状态定义
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间，缺少过期时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}