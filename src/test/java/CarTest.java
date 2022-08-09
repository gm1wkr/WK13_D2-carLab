import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("Sword", "Diesta",1000.00, "Pink", 4, 4, EngineType.PETROL, 300);
    }

    @Test
    public void hasPrice(){
        assertEquals(1000.00, car.getPrice(), 0.0000001);
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", car.getColour());
    }

    @Test
    public void hasSeats(){
        assertEquals(4, car.getNumOfSeats());
    }

    @Test
    public void canGetNumberOfDoors(){
        assertEquals(4, car.getNumberOfDoors());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.PETROL, car.getEngine());
    }
}
