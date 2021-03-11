package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    Multiples multiples;

    @BeforeEach
    void setUp() {
        multiples = new Multiples();
    }

    @AfterEach
    void tearDown() {
        multiples = null;
    }



    @Test
    void testQueryInput(){
        multiples.query();
        assertEquals(16,multiples.getQuery());
    }



    @Test
    void testSecondQueryToCheckIfItsAMultipleOfTheFirst(){
        multiples.argument();
        assertEquals(12, multiples.getArgument());
    }


    @Test
    void testMethodIsMultiple(){
        assertTrue(multiples.isMultiple(3,2));
    }
}