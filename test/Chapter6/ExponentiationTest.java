package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {

    Exponentiation exponentiation;

    @BeforeEach
    void setUp() {
        exponentiation = new Exponentiation();
    }

    @AfterEach
    void tearDown() {
        exponentiation = null;
    }

    @Test
    void testMethodThatTakesBaseInputs(){
        exponentiation.base();
        assertEquals(3,exponentiation.getBase());
    }

    @Test
    void testMethodThatTakesExponentInputs(){
        exponentiation.exponent();
        assertEquals(3,exponentiation.getExponent());
    }

    @Test
    void testMethodToPerformsTheCalculationWithTheIntegerPower(){
        exponentiation.integerPower();
        assertEquals(81,exponentiation.getIntegerPower());
    }


}