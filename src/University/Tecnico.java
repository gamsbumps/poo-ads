package University;

public class Tecnico extends Funcionario{
    private String cargo, departamento;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if(cargo != null){
            this.cargo = cargo;
        }
        else{
            System.out.println("Cargo não pode estar vazio");
        }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if(departamento != null){
            this.departamento = departamento;
        }
        else{
            System.out.println("Departamento deve ser atribuido!");
        }
    }

    public Tecnico() {
        super();
        this.cargo = " ";
        this.departamento = " ";
    }

    public Tecnico(String nome, String cpf, String endereco, String telefone, int numeroCTPS, float salario, String cargo, String departamento) {
        super(nome, cpf, endereco, telefone, numeroCTPS, salario);
        setCargo(getCargo());
        setDepartamento(getDepartamento());
    }
}
