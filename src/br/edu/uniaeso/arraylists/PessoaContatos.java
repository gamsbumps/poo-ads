package br.edu.uniaeso.arraylists;

public class PessoaContatos {
    private String name;
    private String phone;

    public PessoaContatos(String name, String phone) {
        setName(name);
        setPhone(phone);
    }

    public PessoaContatos() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }else{
            System.out.println("Nome não pode ser nulo!");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone != null){
            this.phone = phone;
        }else{
            System.out.println("Telefone não poder ser nulo!");
        }
    }
}
