package ma.formations.service;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.doReturn;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Properties;

@ExtendWith(MockitoExtension.class)
public class Exemple5 {
    @Spy
    Properties spyProperties;
    // demonstrates of the spy function
    @Test
    public void testMockitoThrows() {
        spyProperties.put("shoeSize","-1");
        String value2= (String) spyProperties.get("shoeSize");
        assertEquals("-1", value2);

        doReturn("42").when(spyProperties).get("shoeSize");
        String value = (String) spyProperties.get("shoeSize");
        assertEquals("42", value);
    }

}
