package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSetAccountNumber(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setAccountNumber();
        assertEquals(123456,creditLimitCalculator.getAccountNumber());

    }
    @Test
    void testSetBalance(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setBalance();
        assertEquals(1000,creditLimitCalculator.getBalance());
    }

    @Test
    void testSetCharges(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setCharges();
        assertEquals(1000,creditLimitCalculator.getCharges());
    }
    @Test
    void testSetCredit(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setCredit();
        assertEquals(1000,creditLimitCalculator.getCredit());
    } @Test

    void testSetCreditLimits(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setCredit_limit();
        assertEquals(1000,creditLimitCalculator.getCredit_limit());
    }
    @Test
    void testSetNewBalance(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setNewBalance();
        assertEquals(1000,creditLimitCalculator.getNewBalance());
    }
}