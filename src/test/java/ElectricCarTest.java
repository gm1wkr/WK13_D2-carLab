import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(5000.00, "blue", 4, 2, EngineType.ELECTRIC, ChargeType.RAPID);
    }

    @Test
    public void hasPrice() {
        assertEquals(5000.00, electricCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour() {
        assertEquals("blue", electricCar.getColour());
    }

    @Test
    public void hasSeats() {
        assertEquals(4, electricCar.getNumOfSeats())
    }
}
