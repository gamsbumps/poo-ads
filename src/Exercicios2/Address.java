package Exercicios2;

public class Address {
    String nameAddress, district, city, state, number;


    Address(){
        this.nameAddress = "Rua do padre";
        this.number = "222";
        this.district = "Parnamirim";
        this.city = "Recife";
        this.state = "PE.";
    }
    Address(String nameAddress, String number, String district, String city, String state){
        this.nameAddress = nameAddress;
        this.number = number;
        this.district = district;
        this.city = city;
        this.state = state;

    }

    void printAddress (){
        System.out.println(this.nameAddress + ", " + this.number + ", " + this.district + ", " + this.city + "-" + this.state);
    }


}
