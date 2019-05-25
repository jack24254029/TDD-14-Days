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
            2. 5 的倍數要顯示 Buzz
            3. 3 % 5 的倍數要顯示 FizzBuzz
            4. 其餘顯示該數字
         */
        assertEquals("Fizz",fizzBuzz.checkNumber(3));
        assertEquals("Buzz",fizzBuzz.checkNumber(5));
        assertEquals("FizzBuzz",fizzBuzz.checkNumber(15));
        assertEquals("1",fizzBuzz.checkNumber(1));
    }
}