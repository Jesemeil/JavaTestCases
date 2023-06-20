package tdd;

public class Bike {
    private boolean isOn;
    private int speed;
    public Bike () {
        isOn = false;
        speed = 0;

    }
    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if(!isOn) isOn = true;
    }

    public void turnOff() {
        if(isOn) isOn = false;
    }

    public boolean isOff() {
        return !isOn;
    }


    public void accelerate(int speed) {
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }

    public void increaseAcceleration() {
        if(speed < 20) speed = speed + 1;
        else if(speed > 20 && speed < 31) speed = speed + 2;
        else if(speed > 30 && speed < 41) speed = speed + 3;
        else if (speed > 41) speed = speed + 4;
    }

    public void decelerate(int speed) {
        this.speed = speed;
    }

    public void decreaseAcceleration() {
        if(speed < 20) speed = speed - 1;
        else if(speed > 20 && speed < 31) speed = speed - 2;
        else if(speed > 30 && speed < 41) speed = speed - 3;
        else if (speed > 41) speed = speed - 4;
    }
}
