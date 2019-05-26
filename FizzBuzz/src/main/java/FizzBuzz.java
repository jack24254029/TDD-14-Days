public class FizzBuzz {
    public String checkNumberIsFizz(int num) {
        if (num % 3 == 0 || String.valueOf(num).contains("3")) return "Fizz";
        return String.valueOf(num);
    }

    public String checkNumberIsBuzz(int num) {
        if (num % 5 == 0 || String.valueOf(num).contains("5")) return "Buzz";
        return String.valueOf(num);
    }

    public String checkNumberIsFizzBuzz(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        return String.valueOf(num);
    }
}
