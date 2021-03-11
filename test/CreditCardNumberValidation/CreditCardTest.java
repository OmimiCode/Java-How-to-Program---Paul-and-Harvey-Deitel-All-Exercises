package CreditCardNumberValidation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.function.LongToDoubleFunction;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
CreditCard creditCard;
    Long creditCardNumberMasterCard;
    Long creditCardNumberVisaCard;
    Long creditCardNumberVisaCard1;
    Long visaCard2;

    @BeforeEach
    void setUp() {
        creditCard = new CreditCard();
        creditCardNumberMasterCard = 5399237031622273L;
        creditCardNumberVisaCard = 4388576018402626L;
        creditCardNumberVisaCard1 = 4388576018410707L;
        visaCard2 =4351420023597872L;
    }
    @AfterEach
    void tearDown() { creditCard = null;
    }

    @Test
    void testThatCreditCardHasValidCreditCardNumber() {
        assertTrue(CreditCard.isValid(creditCardNumberMasterCard));
        assertTrue(CreditCard.isValid(3776289282728274L));
//        assertThrows(Throwable<IllegalArgumentException,CreditCard.isValid(97263383900272722L));
//        assertThrows(<IllegalArgumentException.class, creditCard.isValid(97263383900272722L));

    }


    @Test
    void testThatCreditCardHasValidCreditCardNumberStartsWith456or37(){
        char start = Long.toString(creditCardNumberMasterCard).charAt(0);
       assertEquals('5',start);

        char startVisa = Long.toString(creditCardNumberVisaCard).charAt(0);
        assertEquals('4',startVisa);

        char startVisa1 = Long.toString(creditCardNumberVisaCard1).charAt(0);
        assertEquals('4',startVisa1);


    }
//THIS IS COMMENTED OUT DUE TO THE ACCESS MODIFIER-"PRIVATE" IN THE creditCard CLASS

//    @Test
//  void testMethodGetLastDigitThatGeneratesTheLastDigitFromTheRight(){
//        assertEquals(5, creditCard.getLastDigit(12345));
//        assertEquals(8, creditCard.getLastDigit(536353123458L));
//    }
//
//
    @Test
    void testMethodTruncateLastDigitThatGeneratesTheAllDigitsFromTheRightOrTakesOutTheLasTDigit(){
//        assertEquals(1234, creditCard.truncateLastDigit(12345));
//        assertEquals(2323434, creditCard.truncateLastDigit(23234349));
//        assertEquals(4326263736725328L, creditCard.truncateLastDigit(43262637367253283L));
 StringBuilder digit = new StringBuilder();
 int counterLimit =Long.toString(creditCardNumberMasterCard).length();
        for (long counter = 1L; counter <= counterLimit; counter++) {
         long lastDigit = creditCardNumberMasterCard % 10L;
            creditCardNumberMasterCard/=10L;
            digit.append(lastDigit).append(",");
        }
        System.out.println(digit);
    }



//    @Test
//    void testMethodIfDoubledLastDigitIsTwoDigitAfterBeingDoubled(){
//        int result = creditCard.ifDoubledLastDigitIsTwoDigit(0,5);
//        assertEquals(5, result);
//        int result1 = creditCard.ifDoubledLastDigitIsTwoDigit(6,10);
//        assertEquals(7, result1);
//        int result2 = creditCard.ifDoubledLastDigitIsTwoDigit(9,18);
//        assertEquals(18, result2);
//    }

    @Test
    void testMethodSumOfDoubleEvenPlaceThatAddAllTheDigitsInEvenPlacesFromRightToLeftInTheCard(){
        int test = CreditCard.sumOfDoubleEvenPlace(123456L);
        assertEquals(9, test);
        int test1 = CreditCard.sumOfDoubleEvenPlace(12345L);
        assertEquals(12, test1);
        int test2 = CreditCard.sumOfDoubleEvenPlace(creditCardNumberVisaCard);
        assertEquals(37, test2);
        int test3 = CreditCard.sumOfDoubleEvenPlace(creditCardNumberMasterCard);
        assertEquals(37, test3);

    }

    @Test
    void  testMethodSumOfOddPlaceThatAddAllTheDigitsInOddPlacesFromRightToLeftInTheCard(){
        int test = creditCard.sumOfOddPlace(12345L);
        assertEquals(9,test);
        int test1 = creditCard.sumOfOddPlace(creditCardNumberVisaCard);
        assertEquals(38,test1);
        int test2 = creditCard.sumOfOddPlace(creditCardNumberVisaCard1);
        assertEquals(41,test2);
        int test4= creditCard.sumOfOddPlace(creditCardNumberMasterCard);
        assertEquals(23,test4);
    }

    @Test
    void testMethodAddSumOfDoubledEvenPlaceAndSumOfOddPlace(){
    int test = CreditCard.addSumOfDoubledEvenPlaceAndSumOfOddPlace(2,4);
    assertEquals(6,test);
    int test1 = CreditCard.addSumOfDoubledEvenPlaceAndSumOfOddPlace(CreditCard.sumOfDoubleEvenPlace(creditCardNumberMasterCard), creditCard.sumOfOddPlace(creditCardNumberMasterCard) );
    assertEquals(60,test1);
    int test2 = CreditCard.addSumOfDoubledEvenPlaceAndSumOfOddPlace(CreditCard.sumOfDoubleEvenPlace(creditCardNumberVisaCard), creditCard.sumOfOddPlace(creditCardNumberVisaCard) );
    assertEquals(75,test2);
    }

@Test
    void testMethodValidationVerificationChecker(){
        assertTrue(creditCard.isValidationVerificationChecker(creditCardNumberMasterCard));
        assertTrue(creditCard.isValidationVerificationChecker(creditCardNumberVisaCard1));
        assertFalse(creditCard.isValidationVerificationChecker(creditCardNumberVisaCard));
        assertTrue(creditCard.isValidationVerificationChecker(visaCard2));

    }

    @Test
     void testMethodReturnCardType(){
        assertEquals("master card",creditCard.returnCardType(5399237031622273L));
    }








//    @Test
//    void testMethodCanGenerateCreditCardNumber(){
//        Long card1 = creditCard.generateCreditCardNumber();
//        Long card2 = creditCard.generateCreditCardNumber();
//
//        assertNotEquals(card1, card2);
//
//
//        }
//    }

}
