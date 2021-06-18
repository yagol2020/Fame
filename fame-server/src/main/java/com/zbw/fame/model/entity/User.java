package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Date;

/**
 * @author by zzzzbw
 * @since 2021/03/08 16:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class User extends BaseEntity {

    /**
     * 账号
     */
    private String username;

    /**
     * 用户密码 md5存储
     */
    private String passwordMd5;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户显示名称
     */
    private String screenName;

    /**
     * 最后登陆时间
     */
    private Date logged = new Date();
}
