package Chapter5;

import Chapter4.GasMileage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Global_Warming_Facts_QuizTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_Set_Question_1_Method1() {
        Global_Warming_Facts_Quiz quiz = new Global_Warming_Facts_Quiz();
        quiz.question1();
        assertEquals("D", quiz.getQuestion1_Answer());

    }

    @Test
    void test_Set_Question_2_Method1() {
        Global_Warming_Facts_Quiz quiz = new Global_Warming_Facts_Quiz();
        quiz.question2();
        assertEquals("C", quiz.getQuestion2_Answer());

    }

    @Test
    void test_Set_Question_3_Method1() {
        Global_Warming_Facts_Quiz quiz = new Global_Warming_Facts_Quiz();
        quiz.question3();
        assertEquals("D", quiz.getQuestion3_Answer());

    }

    @Test
    void test_Set_Question_4_Method1() {
        Global_Warming_Facts_Quiz quiz = new Global_Warming_Facts_Quiz();
        quiz.question4();
        assertEquals("B", quiz.getQuestion4_Answer());

    }

    @Test
    void test_Set_Question_5_Method1() {
        Global_Warming_Facts_Quiz quiz = new Global_Warming_Facts_Quiz();
        quiz.question5();
        assertEquals("A", quiz.getQuestion5_Answer());

    }


    @Test
    void testMethodToIncrementTotalBy1WhenAnswerIsCorrect() {
        Global_Warming_Facts_Quiz quiz = new Global_Warming_Facts_Quiz();
        quiz.TotalIncrement();
        assertEquals(1,quiz.getQuizTotal());
    }
}


