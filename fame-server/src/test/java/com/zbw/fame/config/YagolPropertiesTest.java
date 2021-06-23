package com.zbw.fame.config;

import com.zbw.fame.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yagol
 * @TIME 2021/6/23 - 2:43 下午
 * @Description
 **/
public class YagolPropertiesTest extends BaseTest {
    @Autowired
    YagolProperties.Init init;

    @Test
    public void test() {
        System.out.println(init.getContentPath());
    }
}