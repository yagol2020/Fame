package com.zbw.fame.model.entity;

import com.zbw.fame.model.enums.LogType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author by zzzzbw
 * @since 2021/03/08 15:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class SysLog extends BaseEntity {

    /**
     * 操作数据
     */
    private String data;

    /**
     * 操作信息
     */
    private String message;

    /**
     * 操作类型
     */
    @Column(columnDefinition = "varchar(32)")
    private LogType logType;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 操作人
     */
    private Integer userId;
}
