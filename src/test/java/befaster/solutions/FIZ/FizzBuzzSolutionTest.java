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
    public void check_fizzBuzz() {
        String answer = fizzBuzz.fizzBuzz(15);
        assertEquals("buzz deluxe", answer);
    }

    @Test
    public void check_buzz_with_5_in_number() {
        String answer = fizzBuzz.fizzBuzz(59);
        assertEquals("buzz", answer);
    }

    @Test
    public void check_fizzBuzz_with_5and3_in_number() {
        String answer = fizzBuzz.fizzBuzz(53);
        assertEquals("fizz buzz", answer);
    }

    @Test
    public void check_fizz_with_3_in_number() {
        String answer = fizzBuzz.fizzBuzz(13);
        assertEquals("fizz", answer);
    }

    @Test
    public void check_minimal_fakedelux() {
        String answer = fizzBuzz.fizzBuzz(11);
        assertEquals("fake deluxe", answer);
    }

    @Test
    public void check_fizz_buzz_delux() {
        String answer = fizzBuzz.fizzBuzz(555);
        assertEquals("fizz buzz fake deluxe", answer);
    }

    @Test
    public void check_fizz_buzz() {
        String answer = fizzBuzz.fizzBuzz(546);
        assertEquals("fizz buzz", answer);
    }

    @Test
    public void check_min_fizz_deluxe() {
        String answer = fizzBuzz.fizzBuzz(3);
        assertEquals("fizz deluxe", answer);
    }

    @Test
    public void check_min_buzz_deluxe() {
        String answer = fizzBuzz.fizzBuzz(5);
        assertEquals("buzz deluxe", answer);
    }

    @Test
    public void check_fizz_buzz_fake_deluxe() {
        String answer = fizzBuzz.fizzBuzz(345);
        assertEquals("fizz buzz fake deluxe", answer);
    }

    @Test
    public void check_fizz_buzz_deluxe() {
        String answer = fizzBuzz.fizzBuzz(1350);
        assertEquals("fizz buzz deluxe", answer);
    }

    @Test
    public void check_buzz_fakedeluxe() {
        String answer = fizzBuzz.fizzBuzz(55);
        assertEquals("buzz fake deluxe", answer);
    }

    @Test
    public void check_fizz_deluxe_2numbers() {
        String answer = fizzBuzz.fizzBuzz(336);
        assertEquals("fizz deluxe", answer);
    }

    @Test
    public void check_min_fizz_fake_deluxe() {
        String answer = fizzBuzz.fizzBuzz(3);
        assertEquals("fizz fake deluxe", answer);
    }
    @Test
    public void check_fizz_fake_deluxe_odd() {
        String answer = fizzBuzz.fizzBuzz(237);
        assertEquals("fizz fake deluxe", answer);
    }

//TODO: buzz fake deluxe
//TODO: fizz buzz fake deluxe
    @Test
    public void check_even_number() {
        String answer = fizzBuzz.fizzBuzz(22);
        assertEquals("22", answer);
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
