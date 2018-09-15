package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizzBuzz;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzzSolution();
    }

    @Test
    public void check_number() {
        String answer = fizzBuzz.fizzBuzz(1);
        assertEquals("1", answer);
    }

    @Test
    public void check_fizz() {
        String answer = fizzBuzz.fizzBuzz(3);
        assertEquals("fizz", answer);
    }

    @Test
    public void check_buzz() {
        String answer = fizzBuzz.fizzBuzz(5);
        assertEquals("buzz", answer);
    }

    @Test
    public void check_fizzBuzz() {
        String answer = fizzBuzz.fizzBuzz(15);
        assertEquals("fizz buzz", answer);
    }

    @Test
    public void check_fizz_with_3_in_number() {
        String answer = fizzBuzz.fizzBuzz(13);
        assertEquals("fizz", answer);
    }

    @Test
    public void check_fizz_with_5_in_number() {
        String answer = fizzBuzz.fizzBuzz(59);
        assertEquals("buzz", answer);
    }

    @Test
    public void check_exceed_min_border() {
        thrown.expect(FizzExceedBorderException.class);
        fizzBuzz.fizzBuzz(0);
    }
    @Test
    public void check_exceed_max_border() {
        thrown.expect(FizzExceedBorderException.class);
        fizzBuzz.fizzBuzz(10000);
    }


}
