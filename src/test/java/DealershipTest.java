import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealershipTest {

    Dealership dealer;
    ElectricCar electricCar;

    @Before
    public void before(){

        dealer = new Dealership(100000.00);
        electricCar = new ElectricCar("Static", "Charge", 5000.00, "blue", 4, 2, EngineType.ELECTRIC, ChargeType.RAPID);

    }

    @Test
    public void hasTill(){
        assertEquals(100000.00, dealer.getTill(), 0.0001);
    }

    @Test
    public void canAddToTill(){
        dealer.addToTill(10000.00);
        assertEquals(110000.00, dealer.getTill(), 0.0000001);
    }

    @Test
    public void canRemoveFromTill(){
        dealer.removeFromTill(10000.00);
        assertEquals(90000.00, dealer.getTill(), 0.0000001);
    }

    @Test
    public void canAddVehicle(){
        dealer.addToOwned(electricCar);
        assertEquals(1, dealer.numberOfCarsOwned());
    }

    @Test
    public void canGetOwnedVehicles(){
        dealer.addToOwned(electricCar);
        assertTrue(dealer.getOwnedVehicles().contains(electricCar));
    }

}
