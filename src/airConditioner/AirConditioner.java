package airConditioner;

public class AirConditioner {
    private boolean isOn;
    private int Temperature;

    public void switchOn() {
        this.isOn = true;
    }
    public void switchoff() {
        this.isOn = false;
    }
    public void tempratureIncreases(int currentValue, int increasingValue) {
        Temperature = currentValue + increasingValue;
        if (Temperature > 30) {
            Temperature = Temperature - increasingValue;
        }
    }
    public void temratureDecreases(int CurrentState, int decreasingValue) {
        Temperature = CurrentState - decreasingValue;
        if (Temperature < 16) {
            Temperature = Temperature + decreasingValue;
        }
    }

    public String getStatus() {
    return isOn ? "ON" : "OFF";
    }
    public int getTemperature() {
        return Temperature;
    }
}
