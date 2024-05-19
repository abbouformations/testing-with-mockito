package ma.formations.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mockStatic;

@ExtendWith(MockitoExtension.class)
public class Exemple11 {
    @Test
    public void testMockFinal(@Mock FinalClass finalMocked) {
        assertNotNull(finalMocked);
    }

    @Test
    public void testMockFinalViaMockStatic() {
        MockedStatic<FinalClass> mockStatic = mockStatic(FinalClass.class);
        assertNotNull(mockStatic);
    }

}
