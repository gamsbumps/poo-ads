package br.edu.uniaeso.arraylists;

import Supermercado.Pessoa;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Contato {
    ArrayList<PessoaContatos> phoneBook;

    public Contato(ArrayList<PessoaContatos> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public ArrayList<PessoaContatos> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(ArrayList<PessoaContatos> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void insertPerson(PessoaContatos persona) {
        PessoaContatos person = new PessoaContatos();
        phoneBook.add(person);
    }

    public void removePerson(PessoaContatos persona) {
        int index = 0;
        try {
            if (getPhoneBook().get(index).getName().equals(persona.getName())) {
                phoneBook.remove(persona);
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira o nome.");
        }
    }

    public int searchPerson(PessoaContatos persona) {

        try {
            for (PessoaContatos pessoaContatos : phoneBook) {
                if (pessoaContatos.getName().equals(persona.getName())) {
                    System.out.println(persona.getName());
                    System.out.println(persona.getPhone());
                } else {
                    System.out.println("Contato não registrado!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira um nome válido.");
        }
        return 0;
    }
}
