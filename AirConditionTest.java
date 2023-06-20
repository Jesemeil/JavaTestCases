package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionTest {
    @Test
    public void testThatAirConditionCanTurnOn() {
        AirCondition myAc = new AirCondition();
        assertFalse(myAc.isOn());
        myAc.turnOn();
        assertTrue(myAc.isOn());

    }

    @Test
    public void testThatAirConditionCanTurnOff(){
        AirCondition myAc = new AirCondition();
                myAc.turnOn();
        assertTrue(myAc.isOn());
        myAc.turnOff();
        assertFalse(myAc.isOn());

    }

    @Test
    public void testThatAirConditionTemperatureCanBeIncreased () {
        AirCondition myAc = new AirCondition();
        myAc.setTemperature(18);
        myAc.increaseTemperature();
        assertEquals(19, myAc.getTemperature());
    }


    @Test
    public void testThatAirConditionTemperatureCanBeDecreased () {
        AirCondition myAc = new AirCondition();
        myAc.setTemperature(25);
        assertEquals(25, myAc.getTemperature());
        myAc.decreaseTemperature();
        assertEquals(24, myAc.getTemperature());


    }
    @Test
    public void testThatAirConditionTemperatureRemains30WhenIncreased () {
       AirCondition myAc = new AirCondition();
        myAc.setTemperature(30);
       assertEquals(30, myAc.getTemperature());
       myAc.increaseTemperature();
       assertEquals(30, myAc.getTemperature());


    }

    @Test
    public void testThatAirConditionTemperatureRemains16WhenDecreased () {
        AirCondition myAc = new AirCondition();
        myAc.setTemperature(16);
        assertEquals(16, myAc.getTemperature());
        myAc.decreaseTemperature();
        assertEquals(16, myAc.getTemperature());
    }

}

