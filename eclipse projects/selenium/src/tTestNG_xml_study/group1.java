package tTestNG_xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group1 {
	  @Test(groups = {"sanity"})
	  public void g1tc1() {
		  
		  Reporter.log("g1tc1 is running", true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void g1tc2() {
		  
		  Reporter.log("g1tc2 is running", true);
	  }
	  
	  @Test(groups = {"sanity"})
	  public void g1tc3() {
		  
		  Reporter.log("g1tc3 is running", true);
	  }
	  
	  @Test(groups = {"regression","sanity"})
	  public void g1tc4() {
		  
		  Reporter.log("g1tc4 is running", true);
	  }
}
