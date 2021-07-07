package com.zbw.fame.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbw.fame.mapper.DomainWordSetMapper;
import com.zbw.fame.model.entity.DomainWordSet;
import com.zbw.fame.service.DomainWordSetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author yagol
 * @TIME 2021/7/7 - 7:15 下午
 * @Description
 **/
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired, @Lazy})
public class DomainServiceImpl extends ServiceImpl<DomainWordSetMapper, DomainWordSet> implements DomainWordSetService {
}
