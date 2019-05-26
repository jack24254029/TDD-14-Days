import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void checkNumberIsFizz() {
        assertEquals("Fizz", fizzBuzz.checkNumberIsFizz(3));
        assertEquals("Fizz", fizzBuzz.checkNumberIsFizz(6));
        assertEquals("Fizz", fizzBuzz.checkNumberIsFizz(9));
        assertEquals("Fizz", fizzBuzz.checkNumberIsFizz(31));
        assertEquals("Fizz", fizzBuzz.checkNumberIsFizz(32));
        assertEquals("Fizz", fizzBuzz.checkNumberIsFizz(33));
        assertEquals("1", fizzBuzz.checkNumberIsFizz(1));
    }

    @Test
    public void checkNumberIsBuzz() {
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(5));
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(10));
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(20));
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(51));
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(52));
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(53));
        assertEquals("1", fizzBuzz.checkNumberIsBuzz(1));
    }

    @Test
    public void checkNumberIsFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.checkNumberIsFizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.checkNumberIsFizzBuzz(30));
        assertEquals("FizzBuzz", fizzBuzz.checkNumberIsFizzBuzz(45));
        assertEquals("1", fizzBuzz.checkNumberIsBuzz(1));
    }
}
