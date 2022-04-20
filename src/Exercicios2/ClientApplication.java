package Exercicios2;

public class ClientApplication {
    public static void main(String[] args) {
        Address addr = new Address();
        Telephone tel = new Telephone();
        Date dt = new Date();
        Client cli = new Client(dt, tel, addr);

        Address ad = new Address("Rua Joao", "22", "Ibura", "Recife","PE");
        Telephone tel2 = new Telephone("81","98787-8585" );
        Date dt2 = new Date(04, 03, 2022);
        Client cli2 = new Client("Fiona", "111.111.111-11", "9.999.999", dt2, tel2, ad);

        cli.printClient();
        cli2.printClient();

    }
}
