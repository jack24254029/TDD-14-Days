public class FizzBuzz {
    public String checkNumberIsFizz(int num) {
        if (num % 3 == 0) return "Fizz";
        return String.valueOf(num);
    }

    public String checkNumberIsBuzz(int num) {
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }
}
