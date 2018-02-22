import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldBeAbleToCreateAStack(){
        Stack stack = new Stack();

        assertNotNull(stack);
    }

    @Test
    public void shouldBeAbleToCreateAnEmptyStackAndShouldBeEmpty(){
        Stack stack = new Stack();

        boolean result = stack.isEmpty();

        assertTrue(result);
    }
}
