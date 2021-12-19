package hard_assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hard_assert_sample4 {
  @Test
  public void tc1assertnotnull()
  {
	  
	  String s = null;
	  String s1 = "dsb";
	  
	 	 
	  Assert.assertNotNull(s1, "string is  null");
	  Reporter.log("tc1 is passed sring is not null",true);
	  
	  Assert.assertNotNull(s, "string is  null");
		 Reporter.log("tc1 is passed sring is not null",true);

	  
  } 

}
