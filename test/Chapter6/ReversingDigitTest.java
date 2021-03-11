package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingDigitTest {
    ReversingDigit reversingDigit;
    @BeforeEach
    void setUp() {
        reversingDigit = new ReversingDigit();}

    @AfterEach
    void tearDown() {
        reversingDigit = null;
    }


    @Test
    void testMethodCanReverseDigits(){
        assertEquals(4321,  reversingDigit.reverse(1234) );
        assertEquals(54643,  reversingDigit.reverse(34645) );

    }
}