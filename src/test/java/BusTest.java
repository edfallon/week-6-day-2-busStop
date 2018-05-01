import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 52);
        person = new Person();
    }

    @Test
    public void getNumberOfPassengersOnBus(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerToBusIfLessThanCapacity(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassengerFromBus(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }
}
