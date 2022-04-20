package Exercicios4;

public class Box {
    private float boxLength, width, height;
    public static int counter = 0;

    public float getBoxLength() {
        return boxLength;
    }

    public void setBoxLength(float boxLength) {
        this.boxLength = boxLength;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Box(float boxLength, float width, float height) {
        counter++;
        this.setBoxLength(boxLength);
        this.setWidth(width);
        this.setHeight(height);
    }

    public Box() {
        counter++;
        this.boxLength = 5;
        this.height = 6;
        this.width = 10;
    }

    public Box(float boxLength){
        counter++;
        this.setBoxLength(boxLength);
        this.setBoxLength(boxLength);
        this.setBoxLength(boxLength);
    }

    public static float volume(float boxLength, float width, float height){
        return boxLength * width * height;
    }
    public float calulateVolume(){
        return boxLength * width * height;
    }
}

