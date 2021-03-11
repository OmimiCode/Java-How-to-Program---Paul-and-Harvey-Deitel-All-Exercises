package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossTest {
CoinToss coinToss;
    @BeforeEach
    void setUp() {
        coinToss = new CoinToss();
    }

    @AfterEach
    void tearDown() {
        coinToss = null;
    }


    @Test
    void testCanBeFlippedToGenerateZeroForTailsAndOneForHeads(){
        int side1 = coinToss.flip();
        int side2 = coinToss.flip();
        assertNotEquals(side1,side2);
    }

    @Test
    void testWhenCoinIsTossItCanGenerateZeroForTailsAndOneForHeads(){
       coinToss.tossCoin();
        assertNotEquals(coinToss.getHeadCount(), coinToss.getTailCount());
        System.out.printf("Head: %d%nTail: %d",coinToss.getHeadCount(), coinToss.getTailCount());

    }
}