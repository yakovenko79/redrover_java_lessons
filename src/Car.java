public class Car {
    String model;
    int maxSpeed;
    String color;
    int age;

    public Car(){

    }

    public Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(String model, String color, int age, int maxSpeed){
        this.model = model;
        this.color = color;
        this.age = age;
        this.maxSpeed = maxSpeed;

    }
}
