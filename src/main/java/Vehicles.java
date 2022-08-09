
public abstract class Vehicles {

    double price;
    String colour;
    int numOfSeats;
    int numberOfDoors;

    EngineType engine;

    public Vehicles(double price, String colour, int numOfSeats, int numberOfDoors, EngineType engine) {
        this.price = price;
        this.colour = colour;
        this.numOfSeats = numOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public EngineType getEngine() {
        return engine;
    }
}
