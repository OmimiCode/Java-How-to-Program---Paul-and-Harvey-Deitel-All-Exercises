package Chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestValueTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testUserCanEnterInputs(){
        SmallestValue smallestValue = new SmallestValue();
        smallestValue.input();
        assertEquals(23,smallestValue.getInput());
    }


    @Test
    void testMethodToGenerateSmallestValue(){
        SmallestValue smallestValue = new SmallestValue();
        smallestValue.minimum();
        assertEquals(2,smallestValue.getMinimum());
    }
}