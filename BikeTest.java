package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testThatTheBikeCanBeTurnedOn (){
        Bike bike1 = new Bike();
        assertFalse(bike1.isOn());
        bike1.turnOn();
        assertTrue(bike1.isOn());

    }
    @Test
    public void testThatTheBikeCanBeTurnedOff () {
        Bike bike1 = new Bike();
        bike1.turnOn();
        assertTrue(bike1.isOn());
        bike1.turnOff();
        assertTrue(bike1.isOff());
    }
    @Test
    public void testThatTheBikeCanAccelerateInIncrementOf1WhenItIsInGearOne () {
        Bike bike1 = new Bike();
        bike1.turnOn();
        bike1.accelerate(15);
        assertEquals(15, bike1.getSpeed());
        bike1.increaseAcceleration();
        assertEquals(16, bike1.getSpeed());

    }
    @Test
    public void testThatTheBikeCanAccelerateInIncrementOf2WhenItIsInGearTwo () {
        Bike bike1 = new Bike();
        bike1.turnOn();
        bike1.accelerate(24);
        assertEquals(24, bike1.getSpeed());
        bike1.increaseAcceleration();
        assertEquals(26, bike1.getSpeed());
    }
    @Test
    public void testThatTheBikeCanAccelerateInIncrementOf3WhenItIsInGearThree () {
        Bike bike1 = new Bike();
        bike1.turnOn();
        bike1.accelerate(35);
        assertEquals(35, bike1.getSpeed());
        bike1.increaseAcceleration();
        assertEquals(38, bike1.getSpeed());
    }
    @Test
    public void testThatTheBikeCanAccelerateInIncrementOf4WhenItIsInGearFour () {
        Bike bike1 = new Bike();
        bike1.turnOn();
        bike1.accelerate(44);
        assertEquals(44, bike1.getSpeed());
        bike1.increaseAcceleration();
        assertEquals(48, bike1.getSpeed());
    }
    @Test
    public void testThatTheBikeCanDecelerateInDecrementOf1WhenItIsInGearOne () {
        Bike bike1 = new Bike();
        bike1.turnOn();
        bike1.decelerate(15);
        assertEquals(15, bike1.getSpeed());
        bike1.decreaseAcceleration();
        assertEquals(14, bike1.getSpeed());
    }
@Test
public void testThatTheBikeCanDecelerateInDecrementOf2WhenItIsInGearTwo () {
    Bike bike1 = new Bike();
    bike1.turnOn();
    bike1.decelerate(24);
    assertEquals(24, bike1.getSpeed());
    bike1.decreaseAcceleration();
    assertEquals(22, bike1.getSpeed());
}
@Test
public void testThatTheBikeCanDecelerateInDecrementOf3WhenItIsInGearThree () {
    Bike bike1 = new Bike();
    bike1.turnOn();
    bike1.decelerate(35);
    assertEquals(35, bike1.getSpeed());
    bike1.decreaseAcceleration();
    assertEquals(32, bike1.getSpeed());
}
@Test
public void testThatTheBikeCanDecelerateInDecrementOf4WhenItIsInGearFour () {
    Bike bike1 = new Bike();
    bike1.turnOn();
    bike1.decelerate(44);
    assertEquals(44, bike1.getSpeed());
    bike1.decreaseAcceleration();
    assertEquals(40, bike1.getSpeed());
}


}
