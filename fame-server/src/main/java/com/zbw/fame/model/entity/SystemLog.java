package com.zbw.fame.model.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author yagol
 * @TIME 2021/6/19 - 11:18 下午
 * @Description
 **/
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class SystemLog extends BaseEntity {
    private String url;
    String description;
    String httpType;
    String method;
    String remoteIp;
    @Column(columnDefinition = "json")
    String parameters;
    @Column(columnDefinition = "text")
    String headers;
    @Column(columnDefinition = "text")
    String result;
    long costTime;
}
