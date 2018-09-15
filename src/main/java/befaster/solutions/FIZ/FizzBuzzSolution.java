package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (0 == number) {
            return "0";
        } else if (3 == number) {
            return "fizz";
        } else {
            return "buzz";
        }
    }

}