import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoVendafactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoVendaInexistente() {
        try {
            IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("aviao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoVendaInvalida() {
        try {
            IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("Bicicleta");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }


}