package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {
    SortArray sortArray;

    @BeforeEach
    void setUp() {

        int[] array = {9,0};
        sortArray = new SortArray(array);
    }

    @AfterEach
    void tearDown() {
        sortArray = null;
    }

    @Test
    void testSort(){
        int[] result ={ 0,9};
         assertEquals(result,   sortArray.sort());

    }

}