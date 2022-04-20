package com.company;

public class Main {

    public static void main(String[] args) {

        Data data1 = new Data();
        Data data2 = new Data(31,12,1);
        System.out.println(data1.toString());
        System.out.println(data2.toString());
        data2.addDia();
        System.out.println(data2.toString());
    }
}
