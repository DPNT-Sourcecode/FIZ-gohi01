package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {

    public int compute(int x, int y) {

        if (x < 0 || y < 0) {
            throw new NumberFormatException("Number should be bigger than 0");
        }

        return x + y;
    }

}
