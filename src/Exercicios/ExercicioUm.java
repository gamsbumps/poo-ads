package Exercicios;

public class ExercicioUm {
    public static void aprovado(double nota1, double nota2){
        double media = (nota1 + nota2)/2;
        if (media >= 7){
            System.out.println("Aluno aprovado");
        }
        else if (media > 3 && media < 7){
            System.out.println("Aluno em recuperação");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }

    public static void main(String[] args) {
        
        aprovado(7, 8);
    }
}
