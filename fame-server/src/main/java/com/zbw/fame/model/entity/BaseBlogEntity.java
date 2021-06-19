package com.zbw.fame.model.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;

/**
 * @author by zzzzbw
 * @since 2021/03/08 11:01
 */
@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class BaseBlogEntity extends BaseEntity{

    /**
     * 逻辑删除 0:未删除 1: 已删除
     */
    @TableLogic
    protected Integer deleted = 0;
}
