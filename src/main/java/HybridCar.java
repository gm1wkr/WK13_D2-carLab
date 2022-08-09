public class HybridCar extends Vehicles {

    ChargeType chargeType;

    public HybridCar(double price, String colour, int numOfSeats, int numberOfDoors, EngineType engine, ChargeType chargeType) {
        super(price, colour, numOfSeats, numberOfDoors, engine);
        this.chargeType = chargeType;
    }
}
