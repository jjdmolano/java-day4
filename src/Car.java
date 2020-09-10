public class Car extends Vehicle {
    private String color;
    private String brand;

    public Car() {
        super(); // This calls the parent's empty constructor
    }

    public Car(String color, String brand) {
        super(); // This calls the parent's empty constructor such that it defaults to having 4 wheels
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

    @Override
    public String toString() {
        return "Car: " + this.color + " " + this.brand + " has " + super.getWheels();
//        super.getWheels refers to the Vehicle class
    }
}
