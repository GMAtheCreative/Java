package bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    private Bike bike;
    @BeforeEach
    public void setUp() {
        bike = new Bike();
        bike.kick(1);
    }
    @Test
    public void test_thatBikeComesOn() {
        bike.kick(1);
        assertEquals("VROOM",bike.getState());
    }
    @Test
    public void test_thatBikeGoesOff() {
        bike.kick(0);
        assertEquals("OFF",bike.getState());
    }
    @Test
    public void test_thatBikeCanAccelerate() {
        bike.setAcceleration(19);
        assertEquals(20,bike.getAcceleration());
    }
    @Test
    public void test_thatBikeSpeedIncreasesPerGear() {
        bike.setAcceleration(22);
        assertEquals(24,bike.getAcceleration());
    }
    @Test
    public void test_thatBikeCanDecelerate() {
        bike.setAcceleration(19);
        bike.setDeceleration(10);
        assertEquals(10, bike.getDeceleration());
    }
    @Test
    public void test_thatBikeCanAccelerateByGear() {
        bike.setAcceleration(30);
        assertEquals(3,bike.getGear());
    }
    @Test
    public void test_thatBikeCanDecelerateByGear() {
        bike.setAcceleration(19);
        bike.setDeceleration(10);
        assertEquals(1,bike.getGear());
    }
}
