package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testMethodToInput(){
        LargestNumber largestNumber = new LargestNumber();
        largestNumber.input();
        assertEquals(12,largestNumber.getInput());
    }



    @Test
    void testMethodToFindMaximumInput(){
        LargestNumber largestNumber = new LargestNumber();
        largestNumber.maximum();
        assertEquals(12,largestNumber.getMaximum());
    }
}