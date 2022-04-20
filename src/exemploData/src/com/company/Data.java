package com.company;
import java.util.Calendar;

public class Data {
    public static final int[] dias_mes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] dias_mes_bissexto = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int dia;
    private int mes;
    private int ano;

    public Data(){
        Calendar c = Calendar.getInstance();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH)+1;
        ano = c.get(Calendar.YEAR);
    }

    public Data(int dia, int mes, int ano){
        this();
        // Verificar se a data inserida é válida
        if(checkData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            // apagar isso depois.
            System.out.println("Data criada com sucesso.");
        }
        else{
            System.out.println("A data inserida foi inválida. Criada uma data padrão.");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(checkData(dia, mes, ano)){
            this.dia = dia;
        }
        else{
            System.out.println("Dia inválido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(checkData(dia, mes, ano)){
            this.mes = mes;
        }
        else{
            System.out.println("Mês inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano >= 0){
            this.ano = ano;
        }
        else {
            System.out.println("Ano inválido!");
        }
    }

    public boolean checkData(int dia, int mes, int ano){
        int [] ref_dias = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        if(checkBissexto(ano)){
            ref_dias = dias_mes_bissexto;
        }
        else{
            ref_dias = dias_mes;
        }
        if(ano >= 0){
            if(mes >0 && mes < 13){
                if(dia > 0 && dia <= ref_dias[mes-1]){
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }
//    Para determinar se um ano é bissexto, execute estas etapas:
//
//    1. Se o ano for uniformemente divisível por 4, vá para a etapa 2. Caso contrário, vá para a etapa 5.
//    2. Se o ano for uniformemente divisível por 100, vá para a etapa 3. Caso contrário, vá para a etapa 4.
//    3. Se o ano for uniformemente divisível por 400, vá para a etapa 4. Caso contrário, vá para a etapa 5.
//    4. O ano é bissexto (tem 366 dias).
//    5. O ano não é um ano bissexto (tem 365 dias).

    public boolean checkBissexto(int ano){
        if(ano % 4 == 0){
            if(ano % 100 == 0){
                if(ano % 400 == 0){
                    return true;
                }
                else return false;
            }
            else return true;
        }
        else return false;
    }

    public void addDia(){
        if(checkData(dia+1, mes, ano)){
            dia += 1;
        }
        else{
            dia = 1;
            if(checkData(dia, mes+1, ano)){
                mes += 1;
            }
            else{
                mes = 1;
                ano +=1;
            }
        }

    }

    @Override
    public String toString() {
        return "Data: " +
                dia + "/" +
                mes + "/" +
                ano;
    }
}
