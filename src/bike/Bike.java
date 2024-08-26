package bike;

public class Bike {
    private boolean isSwitch;
    private int gear;
    private int speed;

    public void kick(int kickValue) {
        if(kickValue == 1) isSwitch = true;
        if(kickValue == 0) isSwitch = false;
    }
    public void setAcceleration(int acceleration) {
        if (isSwitch) {
            speed = acceleration + 1;
            if (speed > 0 && speed< 21) {
                gear = 1;
            }
            else if (speed > 20 && speed < 31) {
                speed = acceleration + 2;
                gear = 2;
            }
            else if (speed > 30 && speed < 41) {
                speed = acceleration + 3;
                gear = 3;
            }
            else if (speed == 41) {
                speed = acceleration + 4;
                gear = 4;
            }
            else if (speed < 0 && speed > 41) gear = 0;
        }
    }
    public void setDeceleration(int deceleration) {
        if (isSwitch) speed -= deceleration;
    }

    public String getState() {
        if (isSwitch == true) return "VROOM";
        else {
            return "OFF";
        }
    }
    public int getAcceleration() {
        return speed;
    }

    public int getDeceleration() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
