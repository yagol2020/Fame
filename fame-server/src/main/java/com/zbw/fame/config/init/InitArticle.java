package com.zbw.fame.config.init;

import com.zbw.fame.config.YagolProperties;
import com.zbw.fame.model.entity.Article;
import com.zbw.fame.model.entity.User;
import com.zbw.fame.model.enums.ArticleStatus;
import com.zbw.fame.util.YagolUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * @author yagol
 * @TIME 2021/6/23 - 11:43 上午
 * @Description
 **/
@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Slf4j
public class InitArticle {

    final YagolProperties.Init yagolInit;

    final static String SPLIT_CHAR = ":";

    public List<Article> initArticle(User user) throws IOException {
        File articleDir = new File(Objects.requireNonNull(getClass().getResource("/")).getPath()
                + yagolInit.getContentPath());
        List<Article> articles = new LinkedList<>();
        for (File articleFile : Objects.requireNonNull(articleDir.listFiles())) {
            Article article = new Article();
            String articleFileName = articleFile.getName();
            try {
                article.setCategoryTemp(articleFileName.split(SPLIT_CHAR)[0]);
                article.setTitle(articleFileName.split(SPLIT_CHAR)[1].replace(".md", ""));
            } catch (Exception exception) {
                log.error("初始化博客时出现错误！查看是否存在\":\"号");
                article.setCategoryTemp("Error");
                article.setTitle("Error");
            }
            article.setContent(YagolUtils.readFile2Str(articleFile));
            article.setHeaderShow(false);
            article.setListShow(true);
            article.setStatus(ArticleStatus.PUBLISH);
            article.setAuthorId(user.getId());
            articles.add(article);
        }
        return articles;
    }
}
