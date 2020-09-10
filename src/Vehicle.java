public class Vehicle {
    private int wheels;

    public int getWheels(){
        return this.wheels;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public Vehicle(){
        this.wheels = 4;
    }

    public Vehicle(int wheels){
        this.wheels = wheels;
    }
}
