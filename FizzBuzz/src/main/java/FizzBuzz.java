public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz.checkNumber(i + 1));
        }
    }

    public String checkNumber(int num) {
        String result;
        if (num % 3 == 0 && num % 5 == 0) {
            result = "FizzBuzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else if (num % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(num);
        }
        return result;
    }
}
