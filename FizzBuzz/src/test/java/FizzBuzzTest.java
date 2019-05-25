import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void checkNumber() {
        /*
            測試案例
            1. 3 的倍數要顯示 Fizz
            2. 數字包含 3 要顯示 Fizz
            3. 5 的倍數要顯示 Buzz
            4. 數字包含 5 要顯示 Buzz
            5. 3 % 5 的倍數要顯示 FizzBuzz
            6. 其餘顯示該數字
         */
        assertEquals("Fizz", fizzBuzz.checkNumber(3));
        assertEquals("Fizz", fizzBuzz.checkNumber(13));
        assertEquals("Fizz", fizzBuzz.checkNumber(31));
        assertEquals("Buzz", fizzBuzz.checkNumber(5));
        assertEquals("Buzz", fizzBuzz.checkNumber(10));
        assertEquals("Buzz", fizzBuzz.checkNumber(52));
        assertEquals("FizzBuzz", fizzBuzz.checkNumber(15));
        assertEquals("1", fizzBuzz.checkNumber(1));
    }
}