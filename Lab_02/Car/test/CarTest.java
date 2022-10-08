import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void myTestCar(){
        Car test = new Car(1);

        Assert.assertEquals(0, test.getGas(), 0);
        test.addGas(10);
        Assert.assertEquals(10, test.getGas(), 0);

        test.drive(5);
        Assert.assertEquals(5, test.getGas(), 0);
    }

    @Test
    public void testSolution() {
        Car car = new Car(0.05);
        car.addGas(10);
        Assert.assertEquals(10, car.getGas(), 0);
        car.drive(10);
        Assert.assertEquals(9.5, car.getGas(), 0);
    }
}