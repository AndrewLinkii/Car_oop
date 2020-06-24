package test;

import code.Car;
import code.CarDoor;
import code.CarWheel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private static final double DELTA = 0.001;
    private Car car;


    @Before
    public void setUp() {
        car = new Car();
        car.setTimeToMaxSpeed(4);
        car.setMaxPassengers(5);
        car.setMaxSpeed(280);
        car.setCurrentPassengersNum(4);
        car.setCurrentSpeed(100);
        car.setEngineType("turbo");
        car.setDoors(new CarDoor[]{new CarDoor(), new CarDoor(),new CarDoor(), new CarDoor()});
        car.setWheels(new CarWheel[]{new CarWheel(), new CarWheel(), new CarWheel(), new CarWheel()});
    }

    @Test
    public void testAddPassenger() {
        car.addPassenger();
        Assert.assertEquals(1, car.getCurrentPassengersNum());
    }

    @Test
    public void testDropPassenger() {
        car.getPassengerOut();
        Assert.assertEquals(0, car.getPassengerOut());
    }

    @Test
    public void testDropAllPassenger() {
        car.getAllPassengersOut();
        Assert.assertEquals(0, car.getAllPassengersOut());
    }


    @Test
    public void getDoorByIndex() {
        CarDoor expected = car.getDoors()[2];
        CarDoor actual = car.getDoorByIndex(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWheelByIndex() {
        CarWheel expected = car.getWheels()[3];
        CarWheel actual = car.getWeelByIndex(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllWheelsTest() {
        CarWheel[] expected = new CarWheel[0];
        CarWheel[] actual = car.removeAllWheels();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void setCurrentSpeedCorrectValue() {
        double expected = 110;
        double actual = car.setCurrentSpeed(110);
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void getCurrentMaxSpeedTest() {
        double expected = 123;
        double actual = car.getMaxSpeed();
        Assert.assertEquals(expected, actual, DELTA);
    }
}
