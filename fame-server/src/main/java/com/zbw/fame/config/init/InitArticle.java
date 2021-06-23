package com.zbw.fame.config.init;

import com.zbw.fame.model.entity.Article;
import com.zbw.fame.model.entity.User;
import com.zbw.fame.model.enums.ArticleStatus;
import com.zbw.fame.util.YagolUtils;
import org.springframework.beans.factory.annotation.Value;
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
public class InitArticle {
    @Value("${yagol.init.contentPath}")
    String contentPath;
    @Value("${yagol.folderName}")
    String folderName;
    static String RESOURCES_PATH = "src/main/resources/".replace('/', File.separatorChar);

    public List<Article> initArticle(User user) throws IOException {
        File articleDir = new File(new File(folderName + File.separatorChar + RESOURCES_PATH + contentPath)
                .getCanonicalPath());
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
