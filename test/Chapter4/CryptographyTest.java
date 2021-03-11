package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testUserCanInputIntegers(){
        Cryptography cryptography = new Cryptography();

        cryptography.userInput();

        assertEquals(1234, cryptography.getUserInput());

    }


    @Test
    void testUserInputPosition1(){
   Cryptography cryptography = new Cryptography();

   cryptography.firstDigit();

   assertEquals(1, cryptography.getFirstDigit());

    }

    @Test
    void testUserInputPosition2(){
        Cryptography cryptography = new Cryptography();

        cryptography.secondDigit();

        assertEquals(2, cryptography.getSecondDigit());

    }
    @Test
    void testUserInputPosition3(){
        Cryptography cryptography = new Cryptography();

        cryptography.thirdDigit();

        assertEquals(3, cryptography.getThirdDigit());

    }
    @Test
    void testUserInputPosition4(){
        Cryptography cryptography = new Cryptography();

        cryptography.fourthDigit();

        assertEquals(4, cryptography.getFourthDigit());

    }
    @Test
    void testMethodToEncrypt() {
        Cryptography cryptography = new Cryptography();
    cryptography.encrypt();
    assertEquals(1234, cryptography.getEncryption());


    }


}