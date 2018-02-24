import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldBeAbleToCreateAStack() {
        Stack stack = new Stack();

        assertNotNull(stack);
    }

    @Test
    public void shouldBeAbleToCreateAnEmptyStackAndShouldBeEmpty() {
        Stack stack = new Stack();

        boolean result = stack.isEmpty();

        assertTrue(result);
    }

    @Test
    public void inANewStackSizeShouldBeZero() {
        Stack stack = new Stack();

        int result = stack.size();

        assertThat(result, is(0));
    }

    @Test
    public void inANewStackWhenOneIsPushedIsEmptyShouldReturnFalse() {
        Stack stack = new Stack();

        stack.push(1);
        boolean result = stack.isEmpty();

        assertFalse(result);
    }

    @Test
    public void inANewStackWhenOneIsPushedSizeShouldReturnOne() {
        Stack stack = new Stack();

        stack.push(1);
        int result = stack.size();

        assertThat(result, is(1));
    }

    @Test
    public void inANewStackWhenOneIsPushedThenOneIsPoppedIsEmptyShouldReturnTrue(){
        Stack stack = new Stack();

        stack.push(1);
        stack.pop();
        boolean result = stack.isEmpty();

        assertTrue(result);
    }

    @Test
    public void inANewStackWhenOneIsPushedThenOneIsPoppedSizeShouldReturnZero(){
        Stack stack = new Stack();

        stack.push(1);
        stack.pop();
        int result = stack.size();

        assertThat(result, is(0));
    }

    @Test
    public void whenOneIsPushedThenCanBePoppedAndGetTheSameValue(){
        Stack stack = new Stack();

        stack.push(1);
        int result =  stack.pop();

        assertThat(result, is(1));
    }

    @Test
    public void whenAnotherOneIsPushedThenCanBePoppedAndGetTheSameValue(){
        Stack stack = new Stack();

        stack.push(7);
        int result =  stack.pop();

        assertThat(result, is(7));
    }

    @Test
    public void whenTwoElementsArePushedAndThenOneIsPoppedIsEmptyShouldReturnFalse(){
        Stack stack = new Stack();

        stack.push(7);
        stack.push(154);
        stack.pop();
        boolean result =  stack.isEmpty();

        assertFalse(result);
    }
}
