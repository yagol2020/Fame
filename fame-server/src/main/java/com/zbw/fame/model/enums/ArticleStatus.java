package com.zbw.fame.model.enums;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * 文章状态
 *
 * @author zzzzbw
 * @since 2019/7/30 9:59
 */
public enum ArticleStatus {
    /**
     * 公开
     */
    PUBLISH,
    /**
     * 草稿
     */
    DRAFT
}
