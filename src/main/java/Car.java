public class Car extends Vehicles {


    private int range;

    public Car(double price, String colour, int numOfSeats, int numberOfDoors, EngineType engine, int range) {
        super(price, colour, numOfSeats, numberOfDoors, engine);
        this.range = range;

    }
}
