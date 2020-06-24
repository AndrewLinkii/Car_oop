package code;

public class CarWheel {
    private double wheelCondition = 1.0;

    public double getWheelCondition() {
        return wheelCondition;
    }

    public void setWheelCondition(double wheelCondition) {
        this.wheelCondition = wheelCondition;
    }

    public void changeTire() {
        wheelCondition = 1.0;
    }

    public double wearOutTire(int percentage) {
        if (percentage > 0 && percentage <= 100) {
            wheelCondition -= wheelCondition * percentage / 100;
        }
        return wheelCondition;
    }

    @Override
    public String toString() {
        return "CarWheel{"
                + "wheelCondition=" + wheelCondition
                + '}';
    }
}
