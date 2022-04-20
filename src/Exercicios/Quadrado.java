package Exercicios;

public class Quadrado {

    int lado;

    Quadrado(){
        this.lado = 5;
    }

    Quadrado(int lado){
        this.lado = lado;
    }
    
    int area(){
        return this.lado * this.lado;
    }

    int perimetro(){
        return 4 * this.lado;
    }
}
