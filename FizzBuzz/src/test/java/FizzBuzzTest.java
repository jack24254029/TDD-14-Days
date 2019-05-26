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
        assertEquals("1", fizzBuzz.checkNumberIsFizz(1));
    }

    @Test
    public void checkNumberIsBuzz() {
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(5));
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(10));
        assertEquals("Buzz", fizzBuzz.checkNumberIsBuzz(15));
        assertEquals("1", fizzBuzz.checkNumberIsBuzz(1));
    }
}
