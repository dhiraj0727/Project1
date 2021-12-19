package soft_assert_study;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert_sample1 {
  @Test
  public void tc1_softassert() {
	  
	  String s1 = "test";
	  String s2 = null;
	  //String s3 = "test3";
	  // to use soft assert we have t create object
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertNotNull(s1, "string is empty");
	  Reporter.log("string is not empty tc is passed",true);
	  
	  soft.assertNotNull(s2, "string is empty");
	 
	  //soft.fail();
	  
	  soft.assertNull(s2,"string is not empty");
	  Reporter.log("string is empty tc is passed",true);

	  	soft.assertAll();
	  //soft.notifyAll();

	  
  }
}
