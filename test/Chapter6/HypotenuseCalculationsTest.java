package Chapter6;

import com.semicolon.tdd.HeartRate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseCalculationsTest {
    HypotenuseCalculations hypotenuseCalculations;

    @BeforeEach
    void setUp() {
        hypotenuseCalculations = new HypotenuseCalculations();
    }

    @AfterEach
    void tearDown() {
        hypotenuseCalculations = null;
    }


    @Test
    void testMethodThatTakesInputOfSide1(){
        hypotenuseCalculations.inputOfSide1();
        assertEquals(20.0,hypotenuseCalculations.getInputOfSide1());
    }


    @Test
    void testMethodThatTakesInputOfSide2(){
        hypotenuseCalculations.inputOfSide2();
        assertEquals(10.0,hypotenuseCalculations.getInputOfSide2());
    }

    @Test
    void testMethodThatGetHypotenuse(){
        hypotenuseCalculations.hypotenuse();
        assertEquals(5.0,hypotenuseCalculations.getHypotenuse());
    }

    @Test
    void testMethodThatCalculatesHypotenuse(){
        hypotenuseCalculations.calculateHypotenuse();
        assertEquals(5.0,hypotenuseCalculations.getCalculatedHypotenuse());
    }

}