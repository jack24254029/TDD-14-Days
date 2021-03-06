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

    public String checkNumberIncludeThree(int num) {
        if (String.valueOf(num).contains("3")) return "Fizz";
        return showNumber(num);
    }

    public String checkNumberIncludeFive(int num) {
        if (String.valueOf(num).contains("5")) return "Buzz";
        return showNumber(num);
    }
}
