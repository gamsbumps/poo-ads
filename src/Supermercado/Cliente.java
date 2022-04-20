package Supermercado;

public class Cliente extends Pessoa{
    private String id_cliente;

    public Cliente(){
        super();
        id_cliente = "";
    }

    public Cliente(String nome, String cpf, String id_cliente) {
        super(nome, cpf);
        this.id_cliente = id_cliente;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome=" + super.getNome() +
                "CPF=" + super.getCpf() +
                "id_cliente='" + id_cliente + '\'' +
                '}';
    }
}
