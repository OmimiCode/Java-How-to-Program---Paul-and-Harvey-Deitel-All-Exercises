//package Chapter4;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class GasMileageTest {
//    GasMileage gasMileage;
//
//    @BeforeEach
//    void setUp() {
//        gasMileage = new GasMileage();
//    }
//
//    @AfterEach
//    void tearDown() {
//        gasMileage = null;
//    }
//
//
//
//
//
//    @Test
//    void testScannerToTakeInputsForTripLimitMilesDrivenAndGallonsUsed(){
////when
//
//        gasMileage = new GasMileage();
//
////given
//        gasMileage.setMilesDriven(6);
//        //assert
//             assertEquals(6,gasMileage.milesDriven);
//
////given
//        gasMileage.setGallonsUsed(3);
//        //assert
//        assertEquals(3,gasMileage.gallonsUsed);
//
//    }
//
//
//    @Test
//    void testToCalculateAndDisplayTheMilesPerGallonObtainedForEachTrip(){
//
//        //given
//        gasMileage = new GasMileage();
//
//        gasMileage.setMilesDriven(6);
//        gasMileage.setGallonsUsed(3);
//
//        //when
//        double mileage=gasMileage.calculateGasMillage();
//
//        //assert
//        assertEquals(2,mileage);
//
//
//    }
//
//}