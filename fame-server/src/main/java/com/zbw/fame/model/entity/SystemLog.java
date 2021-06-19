package com.zbw.fame.model.entity;

import javax.persistence.Entity;

/**
 * @author yagol
 * @TIME 2021/6/19 - 11:18 下午
 * @Description
 **/
@Entity
public class SystemLog extends BaseEntity {
    private String message;
}
