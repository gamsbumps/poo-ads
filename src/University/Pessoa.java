package University;

public class Pessoa {
    private String nome, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
        else{
            System.out.println("Nome não pode estar vazio.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null){
            this.cpf = cpf;
        }
        else{
            System.out.println("CPF não pode ser nulo.");
        }
    }

    public Pessoa() {
        this.nome = " ";
        this.cpf = " ";
    }

    public Pessoa(String nome, String cpf) {
        setNome(getNome());
        setCpf(getCpf());
    }
}
