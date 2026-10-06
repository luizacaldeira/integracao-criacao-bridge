import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegmentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaSegmentoInexistente() {
        try {
            SegmentoFactory.obterSegmento("Governo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Segmento inexistente", e.getMessage());
        }
    }
}
