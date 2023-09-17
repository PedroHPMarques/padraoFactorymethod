import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoVendaSportivoTest {
    @Test
    void deveExecutarVendaSportivo() {
        IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("Sportivo");
        assertEquals("Venda de carro sportivo confirmada", tipo.executar());
    }

    @Test
    void deveCancelarVendaSportivo() {
        IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("Sportivo");
        assertEquals("Venda de carro sportivo cancelada", tipo.cancelar());
    }
}