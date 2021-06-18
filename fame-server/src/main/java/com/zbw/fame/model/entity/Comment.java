package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author by zzzzbw
 * @since 2021/3/8 21:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Comment extends BaseEntity {

    /**
     * 所属文章id
     */
    private Integer articleId;

    /**
     * 父评论id
     */
    private Integer parentId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 昵称
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 网址
     */
    private String website;

    /**
     * 赞
     */
    private Integer agree = 0;

    /**
     * 踩
     */
    private Integer disagree = 0;

    /**
     * 评论ip
     */
    private String ip;

    /**
     * 评论agent
     */
    private String agent;
}
