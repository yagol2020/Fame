package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * @author by zzzzbw
 * @since 2021/03/08 11:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class SysOption extends BaseBlogEntity {

    /**
     * 设置key
     */
    private String optionKey;

    /**
     * 设置 value
     */
    private String optionValue;
}
