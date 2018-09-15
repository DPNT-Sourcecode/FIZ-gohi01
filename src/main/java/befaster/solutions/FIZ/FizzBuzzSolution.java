package befaster.solutions.FIZ;

import java.util.stream.IntStream;

public class FizzBuzzSolution {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9999;
    private static final int MIN_DELUXE = 10;

    public String fizzBuzz(Integer number) {

        if (number < MIN_NUMBER
                || number > MAX_NUMBER) {
            throw new FizzExceedBorderException();
        }

        if (isDeluxe(number) && isFizz(number) && number % 2 != 0) {
            return "fizz fake deluxe";
        } else if (isDeluxe(number) && number % 2 != 0) {
            return "fake deluxe";
        } else if (isDeluxe(number) && isFizz(number) && isBuzz(number)) {
            return "fizz buzz deluxe";
        } else if(isDeluxe(number) && isFizz(number)) {
            return "fizz deluxe";
        }  else if(isDeluxe(number) && isBuzz(number)) {
            return "buzz deluxe";
        } else if (isDeluxe(number)) {
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
        if (number < MIN_DELUXE) {
            return false;
        }

        char[] numberList = number.toString().toCharArray();
        char firstNumber = numberList[0];

        for (char c : numberList) {
            if (firstNumber != c) {
                return false;
            }
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
