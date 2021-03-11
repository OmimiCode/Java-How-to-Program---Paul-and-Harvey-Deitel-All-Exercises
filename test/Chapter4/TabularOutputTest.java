package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabularOutputTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void InputMethod(){
        TabularOutput tabularOutput = new TabularOutput();
        tabularOutput.input();
        assertEquals(2, tabularOutput.getInput());
    }
    @Test
    void InputCounterMethod(){
        TabularOutput tabularOutput = new TabularOutput();
        tabularOutput.methodToLoopCounter();
        assertEquals(2, tabularOutput.getMethodToLoopCounter());
    }


}