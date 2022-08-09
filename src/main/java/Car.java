public class Car extends Vehicles {


    private int range;

    public Car(String make, String model, double price, String colour, int numOfSeats, int numberOfDoors, EngineType engine, int range) {
        super(make, model, price, colour, numOfSeats, numberOfDoors, engine);
        this.range = range;

    }
}
