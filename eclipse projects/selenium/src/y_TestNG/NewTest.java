package y_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1 () {
	  
	  Reporter.log("case is passed", true);
  }
}
