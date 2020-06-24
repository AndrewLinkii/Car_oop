package code;

import java.time.LocalDate;
import java.util.Arrays;

public class Car {
    private final LocalDate manufactureDate;
    private String engineType;
    private int maxSpeed;
    private int timeToMaxSpeed;
    private int maxPassengers;
    private int currentPassengersNum;
    private int currentSpeed;
    private CarWheel[] wheels;
    private CarDoor[] doors;

    public Car() {
        this.manufactureDate = LocalDate.now();
        this.wheels = new CarWheel[0];
        this.doors = new CarDoor[0];
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTimeToMaxSpeed() {
        return timeToMaxSpeed;
    }

    public void setTimeToMaxSpeed(int timeToMaxSpeed) {
        this.timeToMaxSpeed = timeToMaxSpeed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getCurrentPassengersNum() {
        return currentPassengersNum;
    }

    public void setCurrentPassengersNum(int currentPassengersNum) {
        this.currentPassengersNum = currentPassengersNum;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public double setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
        return 0;
    }

    public CarWheel[] getWheels() {
        return wheels;
    }

    public void setWheels(CarWheel[] wheels) {
        this.wheels = wheels;
    }

    public CarDoor[] getDoors() {
        return doors;
    }

    public void setDoors(CarDoor[] doors) {
        this.doors = doors;
    }

    public int addPassenger() {
        if (currentPassengersNum == maxPassengers) {
            return currentPassengersNum;
        }
        return ++currentPassengersNum;
    }

    public int getPassengerOut() {
        if (currentPassengersNum == 0) {
            return currentPassengersNum;
        }
        return --currentPassengersNum;
    }

    public int getAllPassengersOut() {
        return currentPassengersNum = 0;
    }

    public CarDoor getDoorByIndex(int index) {
        return doors != null
                && index >= 0
                && index < doors.length
                ? doors[index]
                : null;
    }

    public CarWheel getWeelByIndex(int index) {
        return wheels != null
                && index >= 0
                && index < wheels.length
                ? wheels[index]
                : null;
    }

    public CarWheel[] removeAllWheels() {
        wheels = new CarWheel[0];
        return new CarWheel[0];
    }

    public void addWheels(int wheelsToAdd) {
        if (wheelsToAdd < 1) {
            return;
        }
        wheels = new CarWheel[wheels.length + wheelsToAdd];
    }

    public double currentMaxSpeed() {
        if (currentPassengersNum == 0) {
            return 0;
        }

        double conditionWheel = 1.0;
        for (CarWheel wheel : wheels) {
            if (wheel.getWheelCondition() < conditionWheel) {
                conditionWheel = wheel.getWheelCondition();
            }
        }
        return  conditionWheel * maxSpeed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "manufactureDate=" + manufactureDate +
                ", engineType='" + engineType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", timeToMaxSpeed=" + timeToMaxSpeed +
                ", maxPassengers=" + maxPassengers +
                ", currentPassengersNum=" + currentPassengersNum +
                ", currentSpeed=" + currentSpeed +
                ", wheels=" + Arrays.toString(wheels) +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}
