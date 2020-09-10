public class Car extends Vehicle {
    private String color;
    private String brand;

    public Car() {
    }

    public Car(String color, String brand) {
        super(4);
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
