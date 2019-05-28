public class FizzBuzz {

    public String showNumber(int num) {
        return String.valueOf(num);
    }

    public String checkNumberByThree(int num) {
        if (num % 3 == 0) return "Fizz";
        return showNumber(num);
    }

    public String checkNumberByFive(int num) {
        if (num % 5 == 0) return "Buzz";
        return showNumber(num);
    }

    public String checkNumberByFifteen(int num) {
        if (num % 15 == 0) return "FizzBuzz";
        return showNumber(num);
    }
}
