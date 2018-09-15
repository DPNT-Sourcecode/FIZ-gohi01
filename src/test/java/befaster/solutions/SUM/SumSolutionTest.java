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
/*
    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }*/

    @Test
    public void sum_1and0() {
        assertEquals(1, sum.compute(1, 0));
    }

    @Test
    public void wrong_number_below_zero() {
        thrown.expect(NumberFormatException.class);

        sum.compute(-1, 0);
    }


}
