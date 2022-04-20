package Exercicios2;

public class Date {
    int date, month, year;

    Date(){
        this.date = 03;
        this.month = 03;
        this.year = 2022;
    }
    Date(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void printDate(){
        System.out.println("Date: " + this.date + "/" + this.month + "/" + this.year);
    }
}
