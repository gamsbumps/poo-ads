package br.edu.uniaeso.exceptionsconta;

public class Banco {
    private String conta, agencia;

    public Banco(String conta, String agencia) {
        this.conta = conta;
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        if(conta != null){
            this.conta = conta;
        } else {
            System.out.println("Conta não pode ser criada com valores negativos");
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        if(agencia != null) {
            this.agencia = agencia;
        } else {
            System.out.println("Agencia não pode ter valores negativos");
        }
    }
}
