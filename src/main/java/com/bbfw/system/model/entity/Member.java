package com.bbfw.system.model.entity;

import com.bbfw.common.base.BaseEntity;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 会员信息实体对象
 *
 * @author youlaitech
 * @since 2026-03-11 18:21
 */
@Data
@TableName("member")
public class Member extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 会员姓名
     */
    private String name;
    /**
     * 会员手机号
     */
    private String mobile;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 会员年龄
     */
    private Integer age;
    /**
     * 是否删除(1:已删除;0:未删除)
     */
    private Integer isDeleted;
}
