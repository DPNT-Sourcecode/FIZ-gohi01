package befaster.solutions.FIZ;

public class FizzBuzzSolution {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9999;

    public String fizzBuzz(Integer number) {

        if (number < MIN_NUMBER
                || number > MAX_NUMBER) {
            throw new FizzExceedBorderException();
        }

        if (number % 3 == 0
                && number % 5 == 0) {
            return "fizz buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return number.toString();
        }
    }
}
