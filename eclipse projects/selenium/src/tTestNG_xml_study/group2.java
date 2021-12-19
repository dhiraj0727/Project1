package tTestNG_xml_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group2 {
	
	  @Test(groups = {"sanity"})
	  public void g2tc1() {
		  
		  Reporter.log("g2tc1 is running", true);
	  }
	  @Test(groups = {"regression","sanity"})
	  public void g2tc2() {
		  
		  Reporter.log("g2tc2 is running", true);
	  }
	  @Test(groups = {"sanity"})
	  public void g2tc3() {
		  
		  Reporter.log("g2tc3 is running", true);
	  }
	  @Test(groups = {"regression"})
	  public void g2tc4() {
		  
		  Reporter.log("g2tc4 is running", true);
	  }
}
