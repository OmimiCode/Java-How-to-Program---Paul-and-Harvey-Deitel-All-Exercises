package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionTest {
TemperatureConversion temperatureConversion;
    @BeforeEach
    void setUp() {
        temperatureConversion = new TemperatureConversion();
    }

    @AfterEach
    void tearDown() {
        temperatureConversion =null;
    }
    @Test
    void testMethodThatTakesInputToBeConverted(){
        temperatureConversion.input();
        assertEquals(34.9, temperatureConversion.getInput());
    }
    @Test
    void testMethodThatConvertsFromFahrenheitToCelsius(){
        assertEquals(25, temperatureConversion.fahrenheitToCelsius(772));
    }

    @Test
    void testMethodThatConvertsFromCelsiusToFahrenheit(){
        assertEquals(77, temperatureConversion.celsiusToFahrenheit(25));
    }
}