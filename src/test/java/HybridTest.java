import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    HybridCar hybrid;

    @Before
    public void before(){
        hybrid = new HybridCar(15000.00, "Green", 2, 2, EngineType.HYBRID, ChargeType.SELF_CHARGING);
    }

    @Test
    public void  canGetPrice(){
        assertEquals(15000.00, hybrid.getPrice(), 0.001);
    }

    @Test
    public void canGetColour(){
        assertEquals("Green", hybrid.getColour());
    }

    @Test
    public void canGetNumberOfSeats(){
        assertEquals(2, hybrid.getNumOfSeats());
    }

    @Test
    public void canGetNumberOfDoors(){
        assertEquals(2, hybrid.getNumberOfDoors());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.HYBRID, hybrid.getEngine());
    }

    @Test
    public void getChargeType(){
        assertEquals(ChargeType.SELF_CHARGING, hybrid.getChargeType());
    }

    @Test
    public void getChargingTime() {
        assertEquals(0, hybrid.chargeType.getChargingTime());
    }
}
