package com.zbw.fame.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 日志操作枚举类
 * @author yagol
 * @author by zzzzbw
 * @since 2021/01/22 16:24
 */
@AllArgsConstructor
@Getter
public enum LogAction {
    /**
     * 查询
     */
    SELECT("查询"),

    //新增
    ADD("新增"),

    UPDATE("更新"),

    DELETE("删除"),

    SUCCESS("操作成功"),

    FAIL("操作失败"),
    ;

    private final String msg;
}
