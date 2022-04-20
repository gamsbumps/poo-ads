package Datas;

public class DataApp {
    public static void main(String[] args) {
        ValidadeData vd = new ValidadeData(31, 12, 2022);
        System.out.println(vd.toString());
        vd.avancarData();
        System.out.println(vd.toString());

    }
}
