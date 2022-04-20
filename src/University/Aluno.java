package University;

public class Aluno extends Pessoa {
    private int matricula, codigoCurso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula > 0){
            this.matricula = matricula;
        }else{
            System.out.println("Por favor, colocar número de matricula.");
        }
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        if(codigoCurso > 0){
            this.codigoCurso = codigoCurso;
        }
        else{
            System.out.println("Código inválido!");
        }
    }
    public Aluno() {
        super();
        this.matricula = 0;
        this.codigoCurso = 0;
    }

    public Aluno(String nome, String cpf, int matricula, int codigoCurso) {
        super(nome, cpf);
        setMatricula(getMatricula());
        setCodigoCurso(getCodigoCurso());
    }
    public void printAluno(){
        System.out.println("Nome aluno: " + getNome() + ", CPF: " + getCpf()
        + ", matricula: " + getMatricula() + ", código do curso: " + getCodigoCurso());
    }
}
