package tTestNG_xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
  @Test
  public void s1tc1() {
	  
	  Reporter.log("s1tc1 is running", true);
  }
  @Test
  public void s1tc2() {
	  
	  Reporter.log("s1tc2 is running", true);
  }
  @Test
  public void s1tc3() {
	  
	  Reporter.log("s1tc3 is running", true);
  }
  @Test
  public void s1tc4() {
	  
	  Reporter.log("s1tc4 is running", true);
  }
}
