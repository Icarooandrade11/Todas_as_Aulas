public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, BaseEntity.STATUS_ATIVO, "Ícaro", "icaro@exemplo.com");
        Pedido pedido = new Pedido(101, BaseEntity.STATUS_ATIVO, cliente, 250.75);

        pedido.exibirDetalhes();
    }
}