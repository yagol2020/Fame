package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.domain.QAbstractAuditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.util.Optional;

/**
 * @author yagol
 * @TIME 2021/6/18
 * @Description Solidity缺陷信息对应实体
 **/
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class SolidityInfo extends BaseEntity {
    private String address;
    private String contractName;
}
