package Revisão;

import java.util.Scanner;

public class ConsoleGUI {
    private int txtItemId, txtQuantity;
    private String txtProduct;
    private double txtPrice;

    private Product products;
    private Scanner scanner;
    private Order order;

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public int getTxtItemId() {
        return txtItemId;
    }

    public void setTxtItemId(int txtItemId) {
        this.txtItemId = txtItemId;
    }

    public int getTxtQuantity() {
        return txtQuantity;
    }

    public void setTxtQuantity(int txtQuantity) {
        this.txtQuantity = txtQuantity;
    }

    public String getTxtProduct() {
        return txtProduct;
    }

    public void setTxtProduct(String txtProduct) {
        this.txtProduct = txtProduct;
    }

    public double getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(float txtPrice) {
        this.txtPrice = txtPrice;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ConsoleGUI(){
        setScanner(new Scanner(System.in));
    }
    public void gui(){
        System.out.println("What's your product name? ");
        setTxtProduct(getScanner().next());

        System.out.println("insert product id: ");
        setTxtItemId(getScanner().nextInt());

        System.out.println("How many items? ");
        setTxtQuantity(getScanner().nextInt());

        setTxtPrice((float) getOrder().calculatePrice());
        setOrder(new Order(getTxtProduct(), getTxtPrice(), getTxtQuantity(),getTxtItemId()));

        System.out.println(getOrder().calculatePrice());

    }
}
