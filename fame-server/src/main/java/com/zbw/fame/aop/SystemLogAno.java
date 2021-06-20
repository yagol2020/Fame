package com.zbw.fame.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author yagol
 * @TIME 2021/6/19 - 11:40 下午
 * @Description
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SystemLogAno {
    String description() default "";
}
