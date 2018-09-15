package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void sum_1and0() {
        assertEquals(1, sum.compute(1, 0));
    }

    @Test
    public void wrong_number1_below_zero() {
        thrown.expect(ExceedBorderException.class);

        sum.compute(-1, 0);
    }

    @Test
    public void wrong_number2_below_zero() {
        thrown.expect(ExceedBorderException.class);

        sum.compute(10, -1);
    }

    @Test
    public void number1_exceed_border() {
        thrown.expect(ExceedBorderException.class);

        sum.compute(101, 1);
    }

    @Test
    public void number2_exceed_border() {
        thrown.expect(ExceedBorderException.class);

        sum.compute(100, 101);
    }
}
