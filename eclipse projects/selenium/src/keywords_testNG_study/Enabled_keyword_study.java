package keywords_testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_keyword_study {
  @Test(enabled = true)
  public void tc1() {
	  Reporter.log("tc1 is running", true);
  }
  @Test
  public void tc2() {
	  Reporter.log("tc2 is running", true);
  }
  @Test(enabled = false)
  public void tc3() {
	  Reporter.log("tc3 is running", true);
  }
  @Test
  public void tc4() {
	  Reporter.log("tc4 is running", true);
  }
  
  
}
