package test;

import code.CarWheel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarWheelTest {
    private static final double DELTA = 0.001;
    private CarWheel carWheel;

    @Before
    public void setUp() {
        carWheel = new CarWheel();
    }

    @Test
    public void testSetWheel() {
        carWheel.setWheelCondition(0.5);
        Assert.assertEquals(0.5, carWheel.getWheelCondition(), DELTA);
    }

    @Test
    public void testConditionTheTire() {
        carWheel.wearOutTire(20);
        Assert.assertEquals(0.8, carWheel.getWheelCondition(), DELTA);
        carWheel.wearOutTire(10);
        Assert.assertEquals(0.72, carWheel.getWheelCondition(), DELTA);
    }

}
