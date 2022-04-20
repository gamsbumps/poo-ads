package Revisão;

public class Order extends Product {
    private int itemId;

    public int getItemId() {
        return itemId;
    }

    public void setItem(int itemId) {
        this.itemId = itemId;
    }

    public Order() {
    }

    public Order(String product, double price, int quantity, int itemId) {
        super(product, price, quantity);
        setItem(itemId);
    }
    public double calculatePrice(){
        if(getQuantity() > 0){
            System.out.println(getProducts() + ", ID: " + getItemId());
        }
        return getPrice() * getQuantity();
    }


}
