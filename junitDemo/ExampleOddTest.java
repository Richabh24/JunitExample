
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleOddTest {

	@Test
    public void testEvenOddNumber(){
        EvenOdd eo = new EvenOdd();
        assertEquals("5 is a odd number", true, eo.isOddNumber(5));
    }
}
