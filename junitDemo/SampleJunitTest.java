/**
 * 
 */
import junit.framework.TestCase;

/**
 * @author nidhi
 *
 */
public class SampleJunitTest extends TestCase {
	   protected int value1, value2;
	   
	   // assigning the values
	  /* protected void setUp(){
	      value1=3;
	      System.out.println("value1= "+value1);
	      value2=3;
	      System.out.println("value2= "+value2);
	   }*/
	   protected void setUp(){
		      value1=5;
		      System.out.println("value1= "+value1);
		      value2=6;
		      System.out.println("value2= "+value2);
		   }

	   // test method to add two values
	   public void testAdd(){
	      double result= value1 + value2;
	      assertTrue(result == 11);
	   }
	   
	   public void tearDown(){
		   System.out.println("This method is tear Down method");
	   }
	}
