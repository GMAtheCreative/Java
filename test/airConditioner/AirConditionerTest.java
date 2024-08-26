package airConditioner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    private AirConditioner airConditioner;
    @BeforeEach
    public void setUp() {
        airConditioner = new AirConditioner();
    }

    @Test
    public void test_airConditionerComesOn() {
        airConditioner.switchOn();
        assertEquals("ON", airConditioner.getStatus());
    }
    @Test
    public void test_airConditionerComesOff() {
        airConditioner.switchoff();
        assertEquals("OFF", airConditioner.getStatus());
    }
    @Test
    public void test_airConditionerTempratureIncreases() {
        airConditioner.tempratureIncreases(16, 3);
        assertEquals(19, airConditioner.getTemperature());
    }
    @Test
    public void test_airConditionerTempratureDecreases() {
        airConditioner.temratureDecreases(30, 10);
        assertEquals(20, airConditioner.getTemperature());
    }
    @Test
    public void test_airConditionDoesnotIncreaseBeyond30(){
        airConditioner.tempratureIncreases(16, 30);
        assertEquals(16, airConditioner.getTemperature());
    }
    @Test
    public void test_airConditionDoesnotDecreaseBelow16(){
        airConditioner.temratureDecreases(16, 3);
        assertEquals(16, airConditioner.getTemperature());
    }
}
