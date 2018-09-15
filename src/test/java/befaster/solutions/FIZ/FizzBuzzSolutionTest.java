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
    public void check_zero_is_fizzBuzz() {
        String answer = fizzBuzz.fizzBuzz(0);
        assertEquals("fizz buzz", answer);
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
    public void check_exceed_border() {
        thrown.expect(FizzExceedBorderException.class);
        fizzBuzz.fizzBuzz(-1);
    }


}
