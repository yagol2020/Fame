package com.zbw.fame.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author yagol
 * @TIME 2021/6/20 - 9:08 下午
 * @Description
 **/
public class YagolUtils {
    public static StringBuilder headers2String(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        StringBuilder headerValues = new StringBuilder(StringUtils.EMPTY);
        while (headerNames.hasMoreElements()) {
            headerValues.append(request.getHeader(headerNames.nextElement()));
        }
        return headerValues;
    }
}
