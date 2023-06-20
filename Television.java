package tdd;

public class Television {
    private String modelName;
    private boolean isOn;
    private int volume;
    private int channel;


  public Television () {
    isOn = false;
    volume = 0;
    channel = 0;


}

    public void setModelName(String name) {
        modelName = name;
    }

    public String getModelName() {
        return modelName;
    }
    public boolean isOn () {
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

    public void setVolume(int volume) {
      this.volume = volume;
    }

    public int getVolume() {
      return volume;
    }

    public void increaseVolume() {
      volume += 6;
    }

    public void decreaseVolume() {
      volume -= 5;
    }

    public void setChannel(int channel) {
      this.channel = channel;
    }

    public int getChannel() {
      return channel;
    }



}
