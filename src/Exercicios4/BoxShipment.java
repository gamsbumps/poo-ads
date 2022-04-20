package Exercicios4;

public class BoxShipment extends BoxWeight{
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public BoxShipment(float boxLength, float width, float height, float weight, float price) {
        super(boxLength, width, height, weight);
        setPrice(price);
    }

    public BoxShipment(float price) {
        setPrice(price);
    }

    public BoxShipment(float boxLength, float weight, float price) {
        super(boxLength, weight);
        setPrice(price);
    }
}
