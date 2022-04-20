package Datas;

public class ValidadeData {
    private int dia, mes, ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
            this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }
        else{
            System.out.println("Mês inválido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0){
            this.ano = ano;
        }
        else{
            System.out.println("Ano invalido!");
        }
    }

    public ValidadeData() {
        setDia(25);
        setMes(03);
        setAno(2022);
    }

    public ValidadeData(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public boolean validarData() {
        if (mes >= 1 && mes <= 12) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    return true;
                } else {
                    return false;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    return true;
                } else {
                    return false;
                }
            } else if (mes == 2) {
                if (ano % 4 != 0) {

                    if (dia >= 1 && dia <= 28) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (ano % 4 == 0) {

                    if (ano % 100 != 0) {

                        if (dia >= 1 && dia <= 29) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {

                        if (ano % 400 == 0) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    public void avancarData(){
        setDia(getDia() + 1);
        if(!validarData()){
            setDia(1);
            if(getMes() < 12){
                setMes(getMes() + 1);
            }
            else{
                setMes(1);
                setAno(getAno() + 1);
            }
        }
    }

    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();
    }
}
