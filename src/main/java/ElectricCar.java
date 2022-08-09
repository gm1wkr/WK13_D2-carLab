public class ElectricCar extends Vehicles{
    ChargeType chargeType;

    public ElectricCar(double price, String colour, int numOfSeats, int numberOfDoors, EngineType engine, ChargeType chargeType) {
        super(price, colour, numOfSeats, numberOfDoors, engine);
        this.chargeType = chargeType;
    }

    public ChargeType getChargeType() {
        return chargeType;
    }
}
