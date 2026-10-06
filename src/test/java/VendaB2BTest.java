import org.example.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaB2BTest {

    @Test
    void deveCalcularValorComResidencial() {
        Segmento segmento = SegmentoFactory.obterSegmento("Residencial");
        TipoVenda venda = new VendaB2B(100.0f);
        venda.setSegmento(segmento);
        assertEquals(90.0f, venda.calcularValor(), 0.01f);
    }

    @Test
    void deveCalcularValorComEmpresarial() {
        Segmento segmento = SegmentoFactory.obterSegmento("Empresarial");
        TipoVenda venda = new VendaB2B(100.0f);
        venda.setSegmento(segmento);
        assertEquals(108.0f, venda.calcularValor(), 0.01f);
    }
}