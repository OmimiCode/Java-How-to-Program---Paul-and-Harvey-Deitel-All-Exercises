package Chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingSalesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void userCanEnterProductNumber(){
        CalculatingSales calculatingSales = new CalculatingSales();
        calculatingSales.productNumber();
        assertEquals(3,calculatingSales.getProductNumber());
    }


    @Test
    void userCanEnterQuantity(){
        CalculatingSales calculatingSales = new CalculatingSales();
        calculatingSales.quantity();
        assertEquals(3,calculatingSales.getQuantity());
    }



    @Test
    void testSwitchCaseMethod(){
        CalculatingSales calculatingSales = new CalculatingSales();
        calculatingSales.switchCase();
        assertEquals(4.50,calculatingSales.getProductPrice());
    }

}