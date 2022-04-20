package com.company;

import java.util.ArrayList;

public class Pedido {

    private String id_pedido;
    private String id_Cliente;
    private ArrayList<Produto> itens = new ArrayList<>();
    private double total_produto;

    public Pedido(String id_pedido, String id_Cliente) {
        this.id_pedido = id_pedido;
        this.id_Cliente = id_Cliente;
        this.total_produto = 0;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public ArrayList<Produto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Produto> itens) {
        this.itens = itens;
    }

    public double getTotal_produto() {
        return total_produto;
    }

    public void setTotal_produto(double total_produto) {
        this.total_produto = total_produto;
    }

    public void addItem(Produto novoItem){
        itens.add(novoItem);
        novoItem.attQtd();
        setTotal_produto(getTotal_produto() + novoItem.getValor());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id_pedido='" + id_pedido + '\'' +
                ", id_Cliente='" + id_Cliente + '\'' +
                ", itens=" + itens +
                ", total_produto=" + total_produto +
                '}';
    }
}
