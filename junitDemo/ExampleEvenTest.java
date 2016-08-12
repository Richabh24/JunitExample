
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.AssertionFailedError;

public class ExampleEvenTest {

	@BeforeClass
	public static void init1()
	{
		System.out.println("This method execute before and only onces");
	}
	@Test
	   public void testAssertions() {
	      //test data
	      String str4 = new String("test");
	      String str5 = "test";
	      
	     assertEquals(str4,str5);
	}
	@Before
	public void init()
	{
		System.out.println("This method execute before every test");
	}
	@Test
    public void testEvenOddForFalseNumber(){
        EvenOdd meo = new EvenOdd();
        assertFalse("3 is a even number",meo.isEvenNumber(3));
	}
	
	@Test
    public void testEvenOddForTrueNumber(){
		EvenOdd meo = new EvenOdd();
        assertTrue("10 is a even number",meo.isEvenNumber(1));
	}
	
	
	@Test
    public void testAddition(){
		EvenOdd meo = new EvenOdd();
        assertTrue("From test Addition method", meo.getSum(15, 10)==25);
	}
	
	
	@Test(timeout = 100)  
	public void timeoutMethod() {  
		while (true){
			break;
		};  
	}
	
	@Test(expected=NumberFormatException.class)
	public void testNull()
	{
		EvenOdd meo = new EvenOdd();
        assertEquals("13 is a even number", true, meo.isEvenNumber(13));
	}
	
	@AfterClass
	public static void testEnds()
	{
		System.out.println("This method execute after all test cases and only onces");
	}
}
