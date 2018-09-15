package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzSolutionTest {

    private FizzBuzzSolution fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzzSolution();
    }

    @Test
    public void check_number() {
        String answer = fizzBuzz.fizzBuzz(0);
        assertEquals("0", answer);
    }



    @Test
    public void check_Fizz() {
        String answer = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", answer);
    }

    @Test
    public void check_buzz() {
        String answer = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", answer);
    }

}