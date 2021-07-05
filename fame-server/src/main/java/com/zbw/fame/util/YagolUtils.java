package com.zbw.fame.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.UUID;

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

    /**
     * 读取指定File到String
     * @param toBeReadFile 被读取的文件File
     * @return 文件内容字符串
     * @throws IOException 文件读取异常
     */
    public static String readFile2Str(File toBeReadFile) throws IOException {
        byte[] bytes = new byte[(int) toBeReadFile.length()];
        FileInputStream fileInputStream = new FileInputStream(toBeReadFile);
        int ret = fileInputStream.read(bytes);
        return new String(bytes, 0, ret);
    }

    /**
     * 得到UUID字符串
     * @return
     */
    public static String getUuidStr(){
        return UUID.randomUUID().toString();
    }

}
