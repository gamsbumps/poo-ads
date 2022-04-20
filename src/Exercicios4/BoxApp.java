package Exercicios4;

public class BoxApp {
    public static void main(String[] args) {
        Box box = new Box(8, 9, 10);
        System.out.println(box.calulateVolume() + "m³");
        System.out.println(Box.volume(10, 14, 15));

        BoxWeight boxw = new BoxWeight(30, 20, 30, 9000);
        System.out.println(boxw.calulateVolume());
        System.out.printf("%.2f",boxw.density());


        Box box2 = new Box(8, 9, 10);
        System.out.println(Box.counter);

    }
}
