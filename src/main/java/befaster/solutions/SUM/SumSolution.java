package befaster.solutions.SUM;

public class SumSolution {

    public int compute(int x, int y) {

        if (x < 0 || y < 0) {
            throw new ExceedBorderException();
        }

        return x + y;
    }

}
