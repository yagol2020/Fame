package com.zbw.fame.config;

import com.alibaba.fastjson.JSONObject;
import com.zbw.fame.aop.SystemLogAno;
import com.zbw.fame.model.entity.SystemLog;
import com.zbw.fame.service.SystemLogService;
import com.zbw.fame.util.YagolUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author yagol
 * @TIME 2021/6/20 - 8:37 下午
 * @Description
 **/
@Slf4j
@Aspect
@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class AopConfig {

    private final SystemLogService systemLogService;


    @Pointcut(value = "@annotation(com.zbw.fame.aop.SystemLogAno)")
    public void systemLogAno() {
    }

    @Around("systemLogAno()")
    public Object around(ProceedingJoinPoint pjp) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            log.error("attributes is null point");
            systemLogService.save(new SystemLog() {
                {
                    this.setCostTime(-1);
                    this.setResult("attributes is null point");
                }
            });
            return null;
        }
        HttpServletRequest request = attributes.getRequest();
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        SystemLogAno resLog = method.getAnnotation(SystemLogAno.class);
        String desc = resLog.description();
        Object result = StringUtils.EMPTY;
        long begin = System.currentTimeMillis();
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long end = System.currentTimeMillis();
        SystemLog systemLog = new SystemLog();
        systemLog.setUrl(request.getRequestURI());
        systemLog.setDescription(desc);
        systemLog.setHttpType(request.getMethod());
        systemLog.setMethod(signature.getDeclaringTypeName() + "." + signature.getName());
        systemLog.setRemoteIp(request.getRemoteAddr());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("parameters", JSONObject.parseArray(JSON.toJSONString(pjp.getArgs())));
        systemLog.setParameters(jsonObject.toJSONString());
        systemLog.setHeaders(YagolUtils.headers2String(request).toString());
        systemLog.setResult(result.toString());
        systemLog.setCostTime(end - begin);
        systemLogService.save(systemLog);
        return result;
    }
}
