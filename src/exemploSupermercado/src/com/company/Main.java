package com.company;

public class Main {

    public static void main(String[] args) {
        Produto pasta_dente = new Produto("111", "Pasta de Dente Colgate", 4.50, 40);
        Produto xampu = new Produto("112", "Xampu Seda", 15.80, 30);
        Produto sabonete = new Produto("113", "Sabonete Nivea", 1.90, 50);

        Cliente cli = new Cliente("Renato", "111.111.111-11", "777");

        Pedido novo_pedido = new Pedido("20220001", cli.getId_cliente());
        novo_pedido.addItem(pasta_dente);
        novo_pedido.addItem(sabonete);
        novo_pedido.addItem(pasta_dente);
        novo_pedido.addItem(xampu);

        System.out.println(novo_pedido.toString());

    }
}