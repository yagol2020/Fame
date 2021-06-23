package com.zbw.fame.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yagol
 * @TIME 2021/6/23 - 2:31 下午
 * @Description
 **/
@Data
@Component
@ConfigurationProperties(prefix = "yagol")
public class YagolProperties {
    private String folderName;

    @Data
    @Component
    @ConfigurationProperties(prefix = "yagol.init")
    public static class Init {
        private String contentPath;
    }
}
