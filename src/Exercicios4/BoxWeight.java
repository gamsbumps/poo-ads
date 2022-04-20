package Exercicios4;

public class BoxWeight extends Box{
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight > 0){
            this.weight = weight;
        }
       else{
            System.out.println("Weight cannot be lower than 0");
        }
    }

    public BoxWeight(float boxLength, float width, float height, float weight) {
        super(boxLength, width, height);
        this.setWeight(weight);
    }

    public BoxWeight() {
        super();
        this.setWeight(6);
    }

    public BoxWeight(float boxLength, float weight) {
        super(boxLength);
        this.setWeight(weight);
    }
    public float density(){
        return weight/calulateVolume();
    }
}
