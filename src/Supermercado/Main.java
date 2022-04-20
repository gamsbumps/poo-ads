package Supermercado;

public class Main {
    public static void main(String[] args) {
        Produto pasta_dente = new Produto("111", "pasta colgate", 4.50, 40);
        Produto xampu = new Produto("112", "xampu seda", 15.80, 30);
        Produto sabonete = new Produto("113", "Sabonete nivea", 1.90, 50);

        Cliente cli = new Cliente("Guilherme", "111.111.111-11", "123");

        Pedido novo_pedido = new Pedido("20202020", cli.getId_cliente());
        novo_pedido.adicionarItem(pasta_dente);
        novo_pedido.adicionarItem(sabonete);
        novo_pedido.adicionarItem(pasta_dente);
        novo_pedido.adicionarItem(xampu);
    }
}
