package Exercicios2;

public class Telephone {
    String ddd, phoneNumber;

    Telephone(){
        this.ddd = "81";
        this.phoneNumber = "99393-8282";
    }
    Telephone(String ddd, String phoneNumber){
        this.ddd = ddd;
        this.phoneNumber = phoneNumber;
    }

    void printPhone(){
        System.out.println("Tel: " + "(" + this.ddd + ")" + this.phoneNumber + "\n");
    }
}
