package Supermercado;

import java.util.ArrayList;

public class Pedido {
    private String id_pedido;
    private String id_cliente;
    private ArrayList<Produto> itens = new ArrayList<>();
    private double total;

    public Pedido(String id_pedido, String id_cliente) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.total = 0;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public ArrayList<Produto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Produto> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void adicionarItem(Produto novoItem){
        itens.add(novoItem);
        novoItem.attQtd();
        setTotal(getTotal() + novoItem.getValor());
    }
}
