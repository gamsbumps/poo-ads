package University;

public class Funcionario extends Pessoa{
    private String endereco, telefone;
    private int numeroCTPS;
    private float salario;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco != null){
            this.endereco = endereco;
        }
        else{
            System.out.println("Por favor, colocar endereço!");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone != null){
            this.telefone = telefone;
        }

    }

    public int getNumeroCTPS() {
        return numeroCTPS;
    }

    public void setNumeroCTPS(int numeroCTPS) {
        if(numeroCTPS > 0){
            this.numeroCTPS = numeroCTPS;
        }
        else{
            System.out.println("Número não pode ser vazio.");
        }
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario > 0){
            this.salario = salario;
        }
        else{
            System.out.println("Salário não pode ser vazio.");
        }
    }

    public Funcionario() {
        super();
        this.endereco = " ";
        this.telefone = " ";
        this.numeroCTPS = 0;
        this.salario = 0;
    }

    public Funcionario(String nome, String cpf, String endereco, String telefone, int numeroCTPS, float salario) {
        super(nome, cpf);
        setEndereco(getEndereco());
        setTelefone(getTelefone());
        setNumeroCTPS(getNumeroCTPS());
        setSalario(getSalario());
    }
}
