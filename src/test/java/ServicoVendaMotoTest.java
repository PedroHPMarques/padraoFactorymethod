import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoVendaMotoTest {
    @Test
    void deveExecutarVendaMoto() {
        IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("Moto");
        assertEquals("Venda de moto confirmada", tipo.executar());
    }

    @Test
    void deveCancelarVendaMoto() {
        IServicoVenda tipo = ServicoVendafactory.obterServicoVenda("Moto");
        assertEquals("Venda de moto cancelada", tipo.cancelar());
    }
}