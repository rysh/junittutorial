package first;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @org.junit.Test
    public void canDivideBy3() {
        FizzBuzz target = new FizzBuzz();


        boolean result = target.canDivideBy3(3);
        boolean expected = true;


        assertTrue(result == expected);
    }

    @org.junit.Test
    public void canDivideBy5() {
        FizzBuzz target = new FizzBuzz();
        assertTrue(target.canDivideBy5(5));
    }

    @Test
    public void fizzBuzz() {
        FizzBuzz target = new FizzBuzz();
        assertEquals("fizzBuzz 1","1",target.convert(1));
        assertEquals("fizzBuzz 2","2",target.convert(2));
        assertEquals("fizzBuzz 3","Fizz",target.convert(3));
    }

    @Test
    public void process() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 15);
        FizzBuzz target = new FizzBuzz(numbers);

        List<String> result = target.convertAll();

        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "FizzBuzz");
        assertThat(result, Is.is(expected));
    }
}