package pr2;

import org.testng.Assert;
import org.testng.annotations.Test;
import pr2.Calc;

public class TestCalcBasic {
    Calc calc = new Calc();

    @Test
    void add2And3() {
        String expected = calc.add(2, 3);
        Assert.assertEquals("5", expected);
    }

    @Test
    void addMinus3And2() {
        String expected = calc.add(2, -3);
        Assert.assertEquals("-1", expected);
    }

    @Test
    void add0Point2And0Point3() {
        String expected = calc.add(0.2, 0.3);
        Assert.assertEquals("0.5", expected);
    }

    @Test
    void subtract2And3() {
        String expected = calc.subtract(2, 3);
        Assert.assertEquals("-1", expected);
    }

    @Test
    void subtract2AndMinus3() {String expected = calc.subtract(2, -3);
        Assert.assertEquals("5", expected);
    }

    @Test
    void subtract0Point2And0Point3() {
        String expected = calc.subtract(0.2, 0.3);
        Assert.assertEquals("-0.1", expected);
    }

    @Test
    void divideBy0() {
        String expected = calc.divide(2, 0);
        Assert.assertEquals("Делить на ноль нельзя!", expected);
    }

    @Test
    void divide2and3First() {
        String expected = calc.divide(2, 3);
        Assert.assertEquals("0.6666666666666666", expected);
    }

    @Test
    void divide2and3Second() {
        String expected = calc.divide(2, 3);
        Assert.assertEquals("0.666666", expected);
    }

    @Test
    void divide2Point5and3Point5() {
        String expected = calc.divide(2.5, 3.5);
        Assert.assertEquals("0.7142857142857143", expected);
    }

    @Test
    void multiply2and3() {
        String expected = calc.multiply(2, 3);
        Assert.assertEquals("6", expected);
    }

    @Test
    void multiply2Point5and3() {
        String expected = calc.multiply(2.5, 3);
        Assert.assertEquals("7.5", expected);
    }
}
