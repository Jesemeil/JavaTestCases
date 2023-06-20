package tdd;

public class AirCondition {

    private boolean isOn;
    private int temperature;

    public AirCondition () {
        isOn = false;
        temperature = 0;
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

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void increaseTemperature() {
       if(temperature < 30) temperature++;
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if(temperature > 16) temperature--;
    }



}


