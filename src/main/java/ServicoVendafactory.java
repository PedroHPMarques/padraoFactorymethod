public class ServicoVendafactory {
    public static IServicoVenda obterServicoVenda(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("ServicoVenda" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServicoVenda)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServicoVenda) objeto;
    }
}
