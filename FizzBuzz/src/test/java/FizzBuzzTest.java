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

}
