package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * @author yagol
 * @TIME 2021/7/7 - 7:12 下午
 * @Description 特定领域语料库
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class DomainWordSet extends BaseEntity {
    String wordChinese;
    String wordEnglish;
    String description;
}
