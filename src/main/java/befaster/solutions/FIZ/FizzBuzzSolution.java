package befaster.solutions.FIZ;

public class FizzBuzzSolution {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9999;

    public String fizzBuzz(Integer number) {

        if (number < MIN_NUMBER
                || number > MAX_NUMBER) {
            throw new FizzExceedBorderException();
        }

        if (isFizz(number) && isBuzz(number)) {
            return "fizz buzz";
        } else if (isFizz(number)) {
            return "fizz";
        } else if (isBuzz(number)) {
            return "buzz";
        } else {
            return number.toString();
        }
    }

    private boolean isBuzz(Integer number) {
        return number % 5 == 0
                || number.toString().contains("5");
    }

    private boolean isFizz(Integer number) {
        return number % 3 == 0
                || number.toString().contains("3");
    }
}
