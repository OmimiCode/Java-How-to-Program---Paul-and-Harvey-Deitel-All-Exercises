package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest{

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testInputItemsSold(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        salesCommissionCalculator.inputItemsSoldPrice();
        assertEquals(1234,salesCommissionCalculator.getItemsInputPriceSold());
    }

   @Test
   void testSalary(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
       salesCommissionCalculator.setSalary();
       assertEquals(500,salesCommissionCalculator.getSalary());
   }

   @Test
  void testCalcSalesCommission(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        salesCommissionCalculator.calcSalesCommission();
        assertEquals(0,salesCommissionCalculator.getCalcSalesCommission());


   }
}

