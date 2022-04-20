package Exercicios2;

public class Client {
    Date date;
    Telephone telephone;
    Address address;

    String name, cpf, rg;
    Client(Date date, Telephone telephone, Address address){
        this.name = "Guilherme";
        this.cpf = "332.258.784-98";
        this.rg = "9.555-971";
        this.date = date;
        this.telephone = telephone;
        this.address = address;
    }
    Client(String name, String cpf, String rg, Date date, Telephone telephone, Address address){
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.date = date;
        this.telephone = telephone;
        this.address = address;
    }

    void printClient(){
        System.out.println("Name " + this.name + ", CPF " + this.cpf + ", RG "+ this.rg);
        date.printDate();
        address.printAddress();
        telephone.printPhone();
    }
}
