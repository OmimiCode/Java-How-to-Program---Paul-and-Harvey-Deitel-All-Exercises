package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    GreatestCommonDivisor GCD;
    @BeforeEach
    void setUp() {
        GCD = new GreatestCommonDivisor();
    }

    @AfterEach
    void tearDown() {
        GCD = null;
    }


    @Test
    void moduloMethod(){
        assertEquals(3, GCD.modulus(243523,10));
        assertEquals(3, GCD.modulus(10, 243523));
        assertEquals(0, GCD.modulus(4,2));
        assertEquals(0, GCD.modulus(2,4));
    }

    @Test
    void testMethodGCD(){
    assertEquals(5, GCD.gcd( 95, 125));
    assertEquals(5, GCD.gcd(125,95));
}


}