package test;

import code.CarDoor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CarDoorTest {
    CarDoor carDoor;

    @Before
    public void setUp() {
        carDoor = new CarDoor();
    }

    @Test
    public void testOpenCloseDoor() {
        Assert.assertTrue(carDoor.openDoor());
        Assert.assertFalse(carDoor.closeDoor());
        Assert.assertTrue(carDoor.openOrCloseDoor());
    }

    @Test
    public void testOpenCloseWindow() {
        Assert.assertTrue(carDoor.openWindow());
        Assert.assertFalse(carDoor.closeWindow());
        Assert.assertTrue(carDoor.openOrCloseWindow());
    }
}