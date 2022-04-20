package Array;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        // write your code here
        int vec[] = {1, 5, 2, 10, -7};
        boolean impar = false;
        boolean par = false;
        double sum = 0;
        double mean;
        int menor_impar=0;
        int maior_par=0;

        for (int i=0; i < vec.length; i++){
            // adicionar ao somatorio
            sum += vec[i];
            //verificar se é par
            if(vec[i] % 2 == 0){
                // numero par
                if(par == false){
                    par = true;
                    maior_par = vec[i];
                }
                else{
                    // numero impar
                    if(vec[i] > maior_par){
                        maior_par = vec[i];
                    }
                }
            }
            else{
                // numero impar
                if(impar == false){
                    impar = true;
                    menor_impar = vec[i];
                }
                else{
                    if(vec[i] < menor_impar){
                        menor_impar = vec[i];
                    }
                }
            }
        }
        mean = sum/vec.length;
        System.out.println("Soma: " + sum);
        System.out.printf("Media: %.2f \n", mean);
        if(par){
            System.out.println("Maior par: " + maior_par);
        }
        else{
            System.out.println("Não existe número par");
        }
        if(impar){
            System.out.println("Menor impar: " + menor_impar);
        }
        else{
            System.out.println("Não existe número ímpar");
        }
    }
}
