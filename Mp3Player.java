package tdd;

public class Mp3Player {
    private boolean isOn;
    private int song;
   public Mp3Player () {
       isOn = false;
   }
    public boolean isOn() {
       return isOn;
    }

    public boolean isOff() {
        return !isOn;
    }

    public void turnOn() {
       if(!isOn) isOn = true;
    }

    public void turnOff() {
       if(isOn) isOn = false;
    }

    public void playSong() {
       if(!isOn) isOn = true;
    }

    public int getPlayingSong() {
       return song;
   }

    public void setSong(int song) {
       this.song = song;
    }

    public void pauseSong() {
    }

    public int getPausedSong() {
       return song;
    }
}
