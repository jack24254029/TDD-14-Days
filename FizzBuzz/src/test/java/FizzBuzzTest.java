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

    @Test
    public void checkNumberByFive() {
        Assert.assertEquals("Buzz", fizzBuzz.checkNumberByFive(5));
        Assert.assertEquals("Buzz", fizzBuzz.checkNumberByFive(10));
        Assert.assertEquals("Buzz", fizzBuzz.checkNumberByFive(15));
        Assert.assertEquals("Buzz", fizzBuzz.checkNumberByFive(20));
    }

    @Test
    public void checkNumberByFifteen() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.checkNumberByFifteen(15));
        Assert.assertEquals("FizzBuzz", fizzBuzz.checkNumberByFifteen(30));
        Assert.assertEquals("FizzBuzz", fizzBuzz.checkNumberByFifteen(45));
    }

    @Test
    public void checkNumberIncludeThree() {
        Assert.assertEquals("Fizz", fizzBuzz.checkNumberIncludeThree(30));
        Assert.assertEquals("Fizz", fizzBuzz.checkNumberIncludeThree(33));
        Assert.assertEquals("Fizz", fizzBuzz.checkNumberIncludeThree(35));
    }

}
