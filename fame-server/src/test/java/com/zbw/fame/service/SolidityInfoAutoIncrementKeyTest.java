package com.zbw.fame.service;

import com.zbw.fame.BaseTest;
import com.zbw.fame.model.entity.SolidityInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yagol
 * @TIME 2021/6/18 - 8:35 下午
 * @Description
 **/
public class SolidityInfoAutoIncrementKeyTest extends BaseTest {

    @Autowired
    SolidityInfoService solidityInfoService;
    @Autowired
    UserService userService;

    @Test
    public void test() {
        SolidityInfo solidityInfo=new SolidityInfo();
        solidityInfo.setAddress("address test");
        solidityInfo.setContractName("contract name test");
        solidityInfoService.save(solidityInfo);
    }

}
