package Exercicios;

public class TrianguloRetangulo {
    double base;
    double altura;
    double hipotenusa;

    TrianguloRetangulo(){
        this.base = 3;
        this.altura = 4;
        this.hipotenusa = 5;
    }
    TrianguloRetangulo(double base, double altura, double hipotenusa){
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }

    double area(){
        return (this.base * this.altura) / 2;
    }
    double perimetro(){

        return this.base + this.altura + this.hipotenusa;
    }
}
