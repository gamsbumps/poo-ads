package br.edu.uniaeso.exceptionsconta;

import java.util.Scanner;

public class CadastroContas {
    private Banco[] bc = new Banco[10];
    private String conta;
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public CadastroContas() {
        setScanner(new Scanner(System.in));
    }

    public void inserir(Banco banco) throws ExcecaoElementoJaExistente, ExcecaoRepositorio {
        System.out.println("Qual sua conta?");
        setConta(getScanner().next());
        for(int i = 0; i < bc.length; i++) {
            if (bc[i].getConta().equals(conta)) {
                throw new ExcecaoElementoJaExistente("Conta já existe!");
            } else if (i < bc.length) {
                bc[i] = banco;
            } else {
                throw new ExcecaoRepositorio("Repositório cheio");
            }
        }
    }

    public void buscar(Banco banco) {

        for (int i = 0; i < bc.length; i++) {
            if (banco.getConta().equals(conta)) {
                System.out.println(banco.getAgencia());
                System.out.println(banco.getConta());
            }
        }
    }
}
