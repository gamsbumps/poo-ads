package Exercicios;

public class AplicacaoTriangulo {
    public static void main(String[] args) {
        System.out.println("Criando objetos...\n");
        TrianguloRetangulo t1, t2, t3;

        t1 = new TrianguloRetangulo();


        System.out.println("Perímetro: " + t1.perimetro() + "cm");
        System.out.println("Área: " + t1.area() + "cm²\n");

        t2 = new TrianguloRetangulo(3,4,5);
        t3 = new TrianguloRetangulo(6,8,10);

        System.out.println("Perímetro: " + t2.perimetro() + "cm");
        System.out.println("Área: " + t2.area() + "cm²\n");

        System.out.println("Perímetro: " + t3.perimetro() + "cm");
        System.out.println("Área: " + t3.area() + "cm²\n");
        t3.base = 4;
        t3.altura = 4;
        t3.hipotenusa = 5.66;
        System.out.println("Perímetro: " + t3.perimetro() + "cm");
        System.out.println("Área: " + t3.area() + "cm²\n");
    }
}
