public class HybridCar extends Vehicles {

    ChargeType chargeType;

    public HybridCar(String make, String model, double price, String colour, int numOfSeats, int numberOfDoors, EngineType engine, ChargeType chargeType) {
        super(make, model, price, colour, numOfSeats, numberOfDoors, engine);
        this.chargeType = chargeType;
    }

    public ChargeType getChargeType() {
        return chargeType;
    }
}
