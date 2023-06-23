package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mp3PlayerTest {
    @Test
    public void testThatTheMp3PlayerIsOffByDefault () {
        Mp3Player sony = new Mp3Player();
        assertFalse(sony.isOn());

    }

    @Test
    public void testThatTheMp3PlayerCanBeTurnedOn () {
        Mp3Player sony = new Mp3Player();
        sony.turnOn();
        assertTrue(sony.isOn());
    }

    @Test
    public void testThatTheMp3PlayerCanBeTurnedOff () {
        Mp3Player sony = new Mp3Player();
        sony.turnOn();
        assertTrue(sony.isOn());
        sony.turnOff();
        assertTrue(sony.isOff());

    }

    @Test
    public void testThatTheMp3PlayerCanPlayASong () {
        Mp3Player sony = new Mp3Player();
        sony.turnOn();
        assertTrue(sony.isOn());
        sony.setSong(3);
        sony.playSong();
        assertEquals(3, sony.getPlayingSong());

    }

    @Test
   public void testThatTheMp3PlayerCanPauseASong () {
        Mp3Player sony = new Mp3Player();
        sony.turnOn();
        sony.setSong(6);
        sony.playSong();
        assertEquals(6, sony.getPlayingSong());
        sony.pauseSong();
        assertEquals(6, sony.getPausedSong());

    }

    @Test
    public void testThatTheMp3PlayerCanResumeAPausedSong () {
        Mp3Player sony = new Mp3Player();
        sony.turnOn();
        assertTrue(sony.isOn());
        sony.setSong(11);
        sony.playSong();
        assertEquals(11, sony.getPlayingSong());
        sony.pauseSong();
        assertEquals(11, sony.getPausedSong());
        sony.playSong();
        assertEquals(11, sony.getPlayingSong());


    }


}
