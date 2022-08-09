
public abstract class Vehicles {

    String make;

    String model;
    double price;
    String colour;
    int numOfSeats;
    int numberOfDoors;

    EngineType engine;



    public Vehicles(String make, String model, double price, String colour, int numOfSeats, int numberOfDoors, EngineType engine) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.numOfSeats = numOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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
