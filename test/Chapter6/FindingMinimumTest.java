package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class FindingMinimumTest {
    FindingMinimum findingMinimum;
    @BeforeEach
    void setUp() {
        findingMinimum = new FindingMinimum();
    }

    @AfterEach
    void tearDown() {
        findingMinimum = null;
    }


    @Test
    void testMethodsThatTakesInFirstFloatingPointNumbers(){
        findingMinimum.input1();
        assertEquals(1.2,findingMinimum.getInput1());
    }

    @Test
    void testMethodsThatTakesInSecondFloatingPointNumbers(){
        findingMinimum.input2();
        assertEquals(2.3,findingMinimum.getInput2());
    }

    @Test
    void testMethodsThatTakesInThirdFloatingPointNumbers(){
        findingMinimum.input3();
        assertEquals(3.4,findingMinimum.getInput3());
    }

    @Test
    void testMethodMinimum3ThatUsesMathDotMinClass(){
        double method = findingMinimum.minimum3(1.2,2.3,3.4);
        assertEquals(1.2,method);

}
    @Test
    void testMethodToFindMinimumOfThreeFloatingInput(){
        findingMinimum.findMinimum();
        assertEquals(1.2,findingMinimum.getMinimum());
    }
}