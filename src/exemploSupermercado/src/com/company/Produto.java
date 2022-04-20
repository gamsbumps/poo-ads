package com.company;

public class Produto {
    private String id_produto;
    private String desc;
    private double valor;
    private int qtd;

    public Produto() {
        this.id_produto = "";
        this.desc = "";
        this.valor = -1;
        this.qtd = -1;
    }

    public Produto(String id_produto, String desc, double valor, int qtd) {
        this.id_produto = id_produto;
        this.desc = desc;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void attQtd(){
        qtd-=1;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id_produto='" + id_produto + '\'' +
                ", desc='" + desc + '\'' +
                ", valor=" + valor +
                ", qtd=" + qtd +
                '}';
    }
}
