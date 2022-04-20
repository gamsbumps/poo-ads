package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Informe o valor desejado: ");
        n = ler.nextInt();

        int f = 1;
        if (n == 0 || n == 1){
            System.out.println("1");
        }else if(n > 1){
            for (int i = 1; i <= n; i++){
                f *= i;
            }
        }

        System.out.println(f);
    }
}
