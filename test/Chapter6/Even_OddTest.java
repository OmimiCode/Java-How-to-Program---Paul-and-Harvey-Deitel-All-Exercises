package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Even_OddTest {
Even_Odd even_odd;
    @BeforeEach
    void setUp() {
        even_odd = new Even_Odd();
    }

    @AfterEach
    void tearDown() {
        even_odd = null;
    }

    @Test
    void testQueryInput(){
        even_odd.query();
        assertEquals(16,even_odd.getQuery());
    }

    @Test
    void testIsEvenMethod(){
        assertTrue(even_odd.isEven(  4));
    }
}