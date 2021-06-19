package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * @author by zzzzbw
 * @since 2021/03/19 10:06
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Category extends BaseBlogEntity {

    private Integer parentId;

    private String name;
}
