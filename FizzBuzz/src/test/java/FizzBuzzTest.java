import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void showNumber() {
        Assert.assertEquals("1", fizzBuzz.showNumber(1));
        Assert.assertEquals("2", fizzBuzz.showNumber(2));
        Assert.assertEquals("4", fizzBuzz.showNumber(4));
    }

    @Test
    public void checkNumberByThree() {
        Assert.assertEquals("Fizz", fizzBuzz.checkNumberByThree(3));
        Assert.assertEquals("Fizz", fizzBuzz.checkNumberByThree(6));
        Assert.assertEquals("Fizz", fizzBuzz.checkNumberByThree(9));
        Assert.assertEquals("Fizz", fizzBuzz.checkNumberByThree(12));
    }

}
