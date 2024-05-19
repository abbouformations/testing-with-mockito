package ma.formations.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Properties;

@ExtendWith(MockitoExtension.class)
public class Exemple4 {
    // demonstrates the configuration of a throws with Mockito
    // not a read test, just "testing" Mockito behavior
    @Mock
    Properties properties;
    @Test
    public void testMockitoThrows() {
        when(properties.get(Mockito.anyString())).thenThrow(new IllegalArgumentException("Stuff"));
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> properties.get("A"));
        assertEquals("Stuff", exception.getMessage());
    }

    }
