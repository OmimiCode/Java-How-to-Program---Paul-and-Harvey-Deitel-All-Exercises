package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityPointsTest {
QualityPoints qualityPoints;
    @BeforeEach
    void setUp() {
        qualityPoints = new QualityPoints();
    }

    @AfterEach
    void tearDown() {
        qualityPoints = null;
    }

    @Test
    void testMethodQualityPoint() throws Exception {
        qualityPoints.studentGrade(89);
        assertEquals(3,qualityPoints.getPoint());
        qualityPoints.studentGrade(90);
        assertEquals(4,qualityPoints.getPoint());
        assertThrows(IllegalArgumentException.class,()->qualityPoints.studentGrade(1000));
        qualityPoints.studentGrade(70);
        assertEquals(2,qualityPoints.getPoint());
        qualityPoints.studentGrade(65);
        assertEquals(1,qualityPoints.getPoint());
        qualityPoints.studentGrade(92);
        assertEquals(4,qualityPoints.getPoint());
        qualityPoints.studentGrade(53);
        assertEquals(0,qualityPoints.getPoint());

    }

}