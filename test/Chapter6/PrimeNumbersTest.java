    package Chapter6;

    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.*;

    class PrimeNumbersTest {
    PrimeNumbers primeNumbers;
        @BeforeEach
        void setUp() {
            primeNumbers = new PrimeNumbers();
        }

        @AfterEach
        void tearDown() {
            primeNumbers=null;
        }


    @Test
        void testIfANumberIsPrime(){
            assertTrue(  primeNumbers.isPrime(3));
            assertTrue(  primeNumbers.isPrime(5));
            assertTrue(  primeNumbers.isPrime(7));
            assertTrue(  primeNumbers.isPrime(2));
            assertTrue(  primeNumbers.isPrime(1));
            assertFalse(  primeNumbers.isPrime(4));
    }

    @Test
    void methodFindPrimesBetween2and10000(){
            primeNumbers.findPrimeNumbersBetween(2, 7);
            primeNumbers.findPrimeNumbersBetween(2, 10000);
    }




    @Test
        void testForTheUpperLimitOfNByGoingAsHighAsTheSquareRootOfN(){
          assertTrue( primeNumbers.isPrimeUpperLimit(3));

    }



    }



