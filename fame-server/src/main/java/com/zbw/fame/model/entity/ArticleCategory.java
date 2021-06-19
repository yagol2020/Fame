package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * @author by zzzzbw
 * @since 2021/03/19 11:06
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class ArticleCategory extends BaseBlogEntity {
    /**
     * 文章id
     */
    private Integer articleId;
    /**
     * 分类id
     */
    private Integer categoryId;
}
