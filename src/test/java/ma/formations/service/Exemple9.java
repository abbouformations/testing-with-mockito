package ma.formations.service;

import ma.formations.dao.ArticleDatabase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Exemple9 {
    @Mock
    ArticleDatabase database;
    @Mock
    User user;
    @InjectMocks
    private ArticleManager manager;

    @Test
    public void shouldDoSomething() {
// calls addListener with an instance of ArticleListener
        manager.initialize();
// validate that addListener was called
        Mockito.verify(database).addListener(Mockito.any(ArticleListener.class));
    }
}
