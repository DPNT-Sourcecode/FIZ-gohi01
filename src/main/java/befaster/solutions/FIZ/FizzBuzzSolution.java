package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (0 == number) {
            return "0";
        } else {
            return "Fizz";
        }
    }

}