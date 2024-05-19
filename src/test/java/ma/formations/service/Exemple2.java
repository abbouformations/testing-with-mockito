package ma.formations.service;

import ma.formations.dao.DaoImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Exemple2 {
    @Mock
    DaoImpl dao;
    @Test
    public void ensureMockitoReturnsTheConfiguredValue() {
// define return value for method getUniqueId()
        when(dao.getUniqueId()).thenReturn(42);
        ServiceImpl service = new ServiceImpl(dao);
// use mock in test....
        assertEquals(service.toString(), "Using database with id: 42");
    }
}
