package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
ParkingCharges parkingCharges;
    @BeforeEach
    void setUp() {
        parkingCharges = new ParkingCharges();
    }

    @AfterEach
    void tearDown() {
        parkingCharges = null;
    }

@Test
void testMethodToInputCustomerName(){
        parkingCharges.setCustomerName();
        assertEquals("PAUL JOHN", parkingCharges.getCustomerName());
}
    @Test
    void testMethodThatTakesUserInputOfHoursParked(){
        parkingCharges.hoursParked();
        assertEquals(23, parkingCharges.getHoursParked());

    }
    @Test
    void testMethodThatCalculateCharges(){
        parkingCharges.calculateCharges();
        assertEquals(10.0, parkingCharges.getCalculatedCharges());

    }


}



