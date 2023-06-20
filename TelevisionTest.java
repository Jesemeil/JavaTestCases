package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
   @Test
   public void testTheTelevisionModelName() {
       Television myTv = new Television();
       myTv.setModelName("toshiba");
       assertEquals("toshiba", myTv.getModelName());

   }



    @Test
    public void testThatTelevisionCanTurnOn () {
        Television myTv = new Television();
        assertFalse(myTv.isOn());
        myTv.turnOn();
        assertTrue(myTv.isOn());

    }

    @Test
    public void testThatTelevisionCanTurnOff () {
        Television myTv = new Television();
        myTv.turnOn();
        assertTrue(myTv.isOn());
        myTv.turnOff();
        assertFalse(myTv.isOn());
    }

    @Test
    public void testThatTelevisionVolumeCanBeIncreased () {
        Television myTv = new Television();
        myTv.setVolume(4);
        assertEquals(4, myTv.getVolume());
        myTv.increaseVolume();
        assertEquals(10, myTv.getVolume());
    }

    @Test
    public void testThatTelevisionVolumeCanBeDecreased () {
        Television myTv = new Television();
        myTv.setVolume(15);
        assertEquals(15, myTv.getVolume());
        myTv.decreaseVolume();
        assertEquals(10, myTv.getVolume());
    }

    @Test
    public void testThatTelevisionChannelCanBeChanged () {
        Television myTv = new Television();
        myTv.setChannel(34);
        assertEquals(34, myTv.getChannel());
    }



}
