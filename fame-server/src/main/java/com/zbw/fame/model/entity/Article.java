package com.zbw.fame.model.entity;

import com.zbw.fame.model.enums.ArticleStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

/**
 * @author by zzzzbw
 * @since 2021/03/09 15:05
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@org.hibernate.annotations.Table(appliesTo = "article", comment = "文章表")
public class Article extends BaseEntity {

    /**
     * 内容标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 内容所属用户id
     */
    private Integer authorId;

    /**
     * 点击量
     */
    private Integer hits = 0;

    /**
     * 文章状态
     */
    @Column(columnDefinition = "varchar(32)")
    private ArticleStatus status;

    /**
     * 列表显示
     */
    private boolean listShow = true;

    /**
     * 顶部显示
     */
    private boolean headerShow = false;

    /**
     * 文章优先级
     */
    private Integer priority = 0;

    /**
     * 是否允许评论
     */
    private Boolean allowComment = true;
}
