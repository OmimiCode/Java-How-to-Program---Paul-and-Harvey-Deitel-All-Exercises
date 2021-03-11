package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {
    SalesCommission salesCommission;
//    int[] payRangeArray = new int[9];
    double basePay;
    @BeforeEach
    void setUp() {
        salesCommission = new SalesCommission();

//        for(int counter = 1; counter <= payRangeArray.length; counter++){
//            payRangeArray[counter] = 0;
//        }

        basePay = 200.0;
    }

    @AfterEach
    void tearDown() {
        salesCommission = null;
    }



    @Test
    void testMethodThatTakesInSalesPersonGrossSaleForTheWeek(){
        assertEquals(200.87,salesCommission.grossSales());

    }

@Test
    void calcSalesCommission(){


         assertEquals(650, salesCommission.calcSalesCommission());


}


@Test
    void findBelongingRange(){
        salesCommission.findRange();
        assertEquals(6, salesCommission.range()  );
}






}