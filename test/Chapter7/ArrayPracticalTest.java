package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPracticalTest {

    @BeforeEach
    void setUp() throws ArrayIndexOutOfBoundsException {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testStringArrays() {
        String[] studentName = {"john", "paul", "chris", "james"};
        for (int i = 0; i < studentName.length; i++) {
            System.out.println(i + " " + studentName[i]);
        }
    }

    @Test
    void testGrade() {
        int[][] grade = {
                {70, 89, 98, 93},
                {57, 49, 82, 90},
                {75, 55, 16, 90},
                {65, 98, 76, 35}
        };
        for (int row = 0; row < grade.length; row++) {
            for (int col = 0; col < grade[row].length; col++) {
                System.out.print(grade[row][col]);
            }
            if (grade[row].length == 4){
                System.out.println();
            }
        }
    }

    @Test
    void toUniversalString() {
    }

    @Test
    void testToString() {
    }
}