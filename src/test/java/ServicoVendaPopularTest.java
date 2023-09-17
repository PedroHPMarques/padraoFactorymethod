import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoVendaPopularTest {
    @Test
    void deveExecutarVendaPopular() {
        IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("Popular");
        assertEquals("Venda de carro popular confirmada", tipo.executar());
    }

    @Test
    void deveCancelarVendaPopular() {
        IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("Popular");
        assertEquals("Venda de carro popular cancelada", tipo.cancelar());
    }
}