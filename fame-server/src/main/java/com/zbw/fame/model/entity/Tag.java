package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * @author by zzzzbw
 * @since 2021/03/15 11:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Tag extends BaseBlogEntity {

    private String name;
}
