package com.zbw.fame.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author yagol
 * @TIME 2021/6/19 - 11:23 下午
 * @Description
 **/
@Data
@MappedSuperclass
public class BaseEntity {
    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected Date createdTime = new Date();

    @TableField(update = "now()")
    protected Date modifiedTime = new Date();
}
