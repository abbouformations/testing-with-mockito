package ma.formations.service;

import ma.formations.dao.ArticleDatabase;

public class ArticleManager {
    private User user;
    private ArticleDatabase database;
    public ArticleManager(User user, ArticleDatabase database) {
        super();
        this.user = user;
        this.database = database;
    }
    public void initialize() {
        database.addListener(new ArticleListener());
    }

}
