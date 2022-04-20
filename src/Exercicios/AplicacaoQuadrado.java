package Exercicios;

public class AplicacaoQuadrado {
    public static void main(String[] args) {
        System.out.println("Criando objetos...\n");
        Quadrado q1, q2, q3;

        q1 = new Quadrado();

        System.out.println("Perímetro: " + q1.perimetro() + "cm");
        System.out.println("Área: " + q1.area() + "cm²\n");

        q2 = new Quadrado(4);
        q3 = new Quadrado(6);

        System.out.println("Perímetro: " + q2.perimetro() + "cm");
        System.out.println("Área: " + q2.area() + "cm²\n");

        System.out.println("Perímetro: " + q3.perimetro() + "cm");
        System.out.println("Área: " + q3.area() + "cm²\n");
    }
}
