package befaster.solutions.FIZ;

import java.util.stream.IntStream;

public class FizzBuzzSolution {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9999;

    public String fizzBuzz(Integer number) {

        if (number < MIN_NUMBER
                || number > MAX_NUMBER) {
            throw new FizzExceedBorderException();
        }

        //count occurences
        if (isDeluxe(number)) {
            return "deluxe";
        } else if (isFizz(number) && isBuzz(number)) {
            return "fizz buzz";
        } else if (isFizz(number)) {
            return "fizz";
        } else if (isBuzz(number)) {
            return "buzz";
        } else {
            return number.toString();
        }
    }

    private boolean isDeluxe(Integer number) {
        if (number < 10) {
            return false;
        }

        //char [] numberList = number.toString().toCharArray();

        final int[] numberList = number.toString().chars()
                .map(x -> x - '0')
                .toArray();
        int sum = IntStream.of(numberList).sum();

        int firstNumber = numberList[0];

        if (firstNumber * number.toString().length() != sum) {
            return false;
        }


        return true;
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
