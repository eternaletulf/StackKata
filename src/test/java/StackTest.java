import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldBeAbleToCreateAStack(){
        Stack stack = new Stack();

        assertNotNull(stack);
    }
}
