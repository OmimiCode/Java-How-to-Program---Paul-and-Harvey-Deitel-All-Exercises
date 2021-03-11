package Chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfOddIntegersTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testPrintingOddIntegersFromUserInput(){
        ProductOfOddIntegers prdtOddInt = new ProductOfOddIntegers();
        prdtOddInt.product_Of_Input_Odd_Integers();
        assertEquals(15,prdtOddInt.getProductOfItsOddIntegers());


    }
}