package com.zbw.fame.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbw.fame.mapper.SystemLogMapper;
import com.zbw.fame.model.entity.SystemLog;
import com.zbw.fame.service.SystemLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author yagol
 * @TIME 2021/6/20 - 10:03 下午
 * @Description
 **/
@Service
@Slf4j
public class SystemLogServiceImpl extends ServiceImpl<SystemLogMapper, SystemLog> implements SystemLogService {
}
