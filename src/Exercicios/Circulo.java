package Exercicios;

public class Circulo {
    private double raio;
    public Circulo(double r){raio = r;}
    public Circulo(){raio = 2;}

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) this.raio = raio;
        System.out.println("Informar raio > 0!");
    }

    public double comprimento(){
        return (2 * 3.14 * raio);
    }
    public double area(){
        return (3.14 * raio * raio);
    }
}
