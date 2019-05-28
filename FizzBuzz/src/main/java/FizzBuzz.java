public class FizzBuzz {

    public String showNumber(int num) {
        return String.valueOf(num);
    }

    public String checkNumberByThree(int num) {
        if (num % 3 == 0) return "Fizz";
        return null;
    }

    public String checkNumberByFive(int num) {
        if (num % 5 == 0) return "Buzz";
        return null;
    }
}
