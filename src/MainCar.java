public class MainCar {
    public static void main(String[] args) {
        Car Audi = new Car();
        Audi.color = "Green";
        Audi.maxSpeed = 280;
        Audi.model = "A6";
        Audi.age = 2;

        Car BMW = new Car("M5", "Black", 300){};


    }
}
