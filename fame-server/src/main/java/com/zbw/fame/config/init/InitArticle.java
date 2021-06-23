package com.zbw.fame.config.init;

import com.zbw.fame.config.YagolProperties;
import com.zbw.fame.model.entity.Article;
import com.zbw.fame.model.entity.User;
import com.zbw.fame.model.enums.ArticleStatus;
import com.zbw.fame.util.YagolUtils;
import lombok.RequiredArgsConstructor;
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
public class InitArticle {

    final YagolProperties.Init yagolInit;

    public List<Article> initArticle(User user) throws IOException {
        File articleDir = new File(Objects.requireNonNull(getClass().getResource("/")).getPath()
                + yagolInit.getContentPath());
        List<Article> articles = new LinkedList<>();
        for (File articleFile : Objects.requireNonNull(articleDir.listFiles())) {
            Article article = new Article();
            article.setTitle(articleFile.getName());
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
