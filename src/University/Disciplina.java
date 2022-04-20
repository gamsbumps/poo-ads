package University;

public class Disciplina {
    private int codigo, cargaHoraria;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo > 0){
            this.codigo = codigo;
        }
        else{
            System.out.println("Código deve conter valores.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
        else{
            System.out.println("Nome de disciplina inválido");
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria > 0){
            this.cargaHoraria = cargaHoraria;
        }
        else{
            System.out.println("Carga horária inválida!");
        }
    }
    public Disciplina(){
        this.codigo = 0;
        this.cargaHoraria = 0;
        this.nome = " ";
    }

    public Disciplina(int codigo, int cargaHoraria, String nome) {
        setCodigo(getCodigo());
        setCargaHoraria(getCargaHoraria());
        setNome(getNome());
    }

    public void printDisciplina(){
        System.out.println("Código disciplina: " + getCodigo() + ", carga horária: " + getCargaHoraria()
        + ", nome da disciplina: " + getNome());
    }
}
