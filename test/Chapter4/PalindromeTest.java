package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testInputAndValidateInputIsFiveDigitIntegers(){

        Palindrome palindrome = new Palindrome();

        palindrome.input();
        assertEquals(12321, palindrome.getInput());
    }


    @Test
    void testMethodDetectPalindromic(){
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindromic();
        assertEquals(12321, palindrome.getIsPalindromic());

    }




}