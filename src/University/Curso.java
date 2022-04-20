package University;

public class Curso {
    private int codigo, duracao;
    private String nomeCurso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo > 0){
            this.codigo = codigo;
        }
        else{
            System.out.println("Por favor, insira código do curso.");
        }
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if(duracao > 0){
            this.duracao = duracao;
        }
        else{
            System.out.println("Duração inválida!");
        }
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        if(nomeCurso != null){
            this.nomeCurso = nomeCurso;
        }
        else{
            System.out.println("Código do curso nao pode ficar vazio!");
        }
    }
    public Curso(){
        this.codigo = 0;
        this.duracao = 0;
        this.nomeCurso = " ";
    }
    public Curso(int codigo, int duracao, String nomeCurso) {
        setCodigo(getCodigo());
        setDuracao(getDuracao());
        setNomeCurso(getNomeCurso());
    }
    public void printCurso(){
        System.out.println("Código do curso: " + getCodigo() + ", duração: " + getDuracao()
        + ", nome do curso: " + getNomeCurso());
    }
}
