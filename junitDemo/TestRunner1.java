import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {
   public static void main(String[] args) {
     // Result result = JUnitCore.runClasses(ExampleEvenTest.class);
   // Result result = JUnitCore.runClasses(ExampleOddTest.class);
     // Result result = JUnitCore.runClasses(SampleJunitTest.class);
     //Result result = JUnitCore.runClasses(MyoddEvenSuitTest.class);
     // Result result = JUnitCore.runClasses(AnnotationTest.class);
      Result result = JUnitCore.runClasses(ExceptionDemo.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}  
