package befaster.solutions.SUM;

public class SumSolution {

    public int compute(int x, int y) {

        if (x < 0
                || y < 0
                || x > 100
                || y > 100) {
            throw new ExceedBorderException();
        }

        return x + y;
    }

}
