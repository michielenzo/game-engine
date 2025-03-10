import org.junit.Assert;
import org.junit.Test;
import tryout.Calculator;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();

        Assert.assertEquals(4, calculator.add(2,2));
    }
}