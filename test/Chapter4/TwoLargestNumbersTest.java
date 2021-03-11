package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoLargestNumbersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testInputNumbers(){
        TwoLargestNumbers twoLargestNumbers = new TwoLargestNumbers();
        twoLargestNumbers.number();
        assertEquals(3,twoLargestNumbers.getFirstLargestNumber());
        assertEquals(2,twoLargestNumbers.getSecondLargestNumber());
    }
}