public class ServicoVendaMoto implements IServicoVenda {
    public String executar() {
        return "Venda de moto confirmada";
    }

    public String cancelar() {
        return "Venda de moto cancelada";
    }
}
