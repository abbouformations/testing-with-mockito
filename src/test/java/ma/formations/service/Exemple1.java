package ma.formations.service;

import ma.formations.dao.DaoImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class Exemple1 {

    @Mock
    DaoImpl dao;
    @Test
    public void testQuery() {
        assertNotNull(dao);
        when(dao.isAvailable()).thenReturn(true);
        ServiceImpl service = new ServiceImpl(dao);
        boolean check = service.query("* from t");
        assertTrue(check);
    }

}
