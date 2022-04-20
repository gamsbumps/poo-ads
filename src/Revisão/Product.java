package Revisão;

public class Product {
    private String products;
    private double price;
    private int quantity;

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product() {
    }

    public Product(String products, double price, int quantity) {
        setProducts(products);
        setPrice(price);
        setQuantity(quantity);
    }
}
