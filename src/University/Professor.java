package University;

public class Professor extends Funcionario{
    private String titulacao, areaDePesquisa;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        if(titulacao != null){
            this.titulacao = titulacao;
        }
        else{
            System.out.println("Professor precisa de titulação");
        }
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        if(areaDePesquisa != null){
            this.areaDePesquisa = areaDePesquisa;
        }
        else{
            System.out.println("Área de pesquisa precisa ser designada.");
        }
    }

    public Professor() {
        super();
        this.titulacao = " ";
        this.areaDePesquisa = " ";
    }



    public Professor(String nome, String cpf, String endereco, String telefone, int numeroCTPS, float salario, String titulacao, String areaDePesquisa) {
        super(nome, cpf, endereco, telefone, numeroCTPS, salario);
        setTitulacao(getTitulacao());
        setAreaDePesquisa(getAreaDePesquisa());
    }
    public void printProfessor(){
        System.out.println("Nome do professor: " + getNome() + ", cpf: " + getCpf()
        + ", endereço: " + getEndereco() + ", telefone: " + getTelefone() + ", numero ctps: " + getNumeroCTPS()
        + ", salario: " + getSalario());
    }
}
