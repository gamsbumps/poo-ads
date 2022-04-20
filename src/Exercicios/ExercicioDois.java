package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Informe o valor desejado: ");
        n = ler.nextInt();
        List<Integer> vetor = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            if (i % 2 == 0){
                vetor.add(i);
            }
        }
        System.out.println(vetor);
    }
}
