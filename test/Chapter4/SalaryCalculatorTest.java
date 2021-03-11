package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SalaryCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMethodToSetEmployeeId(){
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.setEmployeeID();
        assertEquals(12,salaryCalculator.getEmployeeID());
    }


    @Test
    void testMethodToSetHourlyRate(){
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.setHourlyRate();
        assertEquals(100,salaryCalculator.getHourlyRate());
    }

    @Test
    void testMethodToSetHoursWorked(){
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.setHoursWorked();
        assertEquals(12,salaryCalculator.getHoursWorked());
    }

    @Test
    void testMethodGrossPayCalculation(){
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.setGrossPayCalculationMethod();
        assertEquals(12,salaryCalculator.getGrossPayCalculationMethod());
    }

}