package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingSquareOfAsterisksTest {
    DisplayingSquareOfAsterisks displayingSquareOfAsterisks;

    @BeforeEach
    void setUp() {
        displayingSquareOfAsterisks = new DisplayingSquareOfAsterisks();
    }

    @AfterEach
    void tearDown() {
        displayingSquareOfAsterisks = null;
    }

    @Test
    void testMethodForInputOfRows() {
        displayingSquareOfAsterisks.numberOfRow();
        assertEquals(4, displayingSquareOfAsterisks.getNumberOfRows());

    }
}