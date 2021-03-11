package Chapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tax_Plan_AlternativesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testUserInputExpensesOnAllCategoriesOfHousing() {
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        // housing
        fairTax.housingExpenses();
        double housing = fairTax.getHousingExpenses();
        assertEquals(2000.00, housing);

    }

    @Test
    void testUserInputExpensesOnAllCategoriesOfFood() {
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        // food
        fairTax.foodExpenses();
        double food = fairTax.getFoodExpenses();
        assertEquals(2000.00, food);
    }

    @Test
    void testUserInputExpensesOnAllCategoriesOfClothing() {
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        // clothing
        fairTax.clothingExpenses();
        double clothing = fairTax.getClothingExpenses();
        assertEquals(2000.00, clothing);
    }

    @Test
    void testUserInputExpensesOnAllCategoriesOfTransportation() {
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        // transportation
        fairTax.transportationExpenses();
        double transportation =fairTax.getTransportationExpenses();
        assertEquals(2000.00, transportation);
    }

    @Test
    void testUserInputExpensesOnAllCategoriesOfEducation() {
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        // education
        fairTax.educationExpenses();
        double education = fairTax.getEducationExpenses();
        assertEquals(2000.00,education);
    }

    @Test
    void testUserInputExpensesOnAllCategoriesOfHealthCare() {
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        // health care
        fairTax.healthCareExpenses();
        double healthCare = fairTax.getHealthCareExpenses();
        assertEquals(2000.00, healthCare);
    }

    @Test
    void testUserInputExpensesOnAllCategoriesOfVacation() {
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        // vacations
        fairTax.vacationExpenses();
        double vacation = fairTax.getVacationExpenses();

        assertEquals(2000.00, vacation);
    }

    @Test
    void testTotalOfUserExpenses(){
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        fairTax.totalExpenses();
        assertEquals(14000, fairTax.getTotalExpenses());
    }

    @Test
    void TaxationMethod(){
        Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
        fairTax.taxation();
        assertEquals(4200.00, fairTax.getTaxation());

    }

@Test
    void testMethodToDisplayOutPutDetails(){
    Tax_Plan_Alternatives fairTax = new Tax_Plan_Alternatives();
    fairTax.details();
    String details = fairTax.displayDetails();
    assertEquals("your overall tax is 4200", details);

}

}

