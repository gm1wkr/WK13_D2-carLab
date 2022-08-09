import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;
    Car car;

    @Before
    public void before( ){
        customer = new Customer(20000.00);
        car = new Car("Sword", "Diesta",2000.00,"Pink", 2, 2 , EngineType.PETROL, 2000 );
    }

    @Test
    public void hasMoney(){
        assertEquals(20000.00, customer.getMoney(), 0.001);
    }

    @Test
    public void canPayTrue(){
        assertTrue(customer.payMoney(2000.00));
    }
    @Test
    public void canPayFalse(){
        assertFalse(customer.payMoney(20001));
    }

    @Test
    public void canAddVehicle(){
        customer.addToOwned(car);
        assertEquals(1, customer.numberOfCarsOwned());
    }

    @Test
    public void getOwnedVehicles(){
        customer.addToOwned(car);
        assertTrue(customer.getOwnedVehicles().contains(car));
    }
}
