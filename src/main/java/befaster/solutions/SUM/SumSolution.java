package befaster.solutions.SUM;

public class SumSolution {

    private static final int MAX_X = 100;
    private static final int MAX_Y = 100;
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;

    public int compute(int x, int y) {

        if (x < MIN_Y
                || y < MIN_Y
                || x > MAX_X
                || y > MAX_Y) {
            throw new ExceedBorderException();
        }

        return x + y;
    }
}
