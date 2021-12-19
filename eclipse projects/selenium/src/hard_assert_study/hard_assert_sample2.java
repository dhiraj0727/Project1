package hard_assert_study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hard_assert_sample2 {
  @Test
  public void TC1AssertnotEquals() {
	  
	  String s1 ="a";
	  String s2 ="a";
	  
	  Assert.assertNotEquals(s1,s2,"both are same");
	  
	  	Reporter.log("both are diff", true);
  
  
  }

	@Test
	public void TC1asserttrue()
	{
		boolean result = true;
		
		Assert.assertTrue(result);
		Reporter.log("result is true",true);
	}
	
	@Test
	public void TC1assertfalse()
	{
		boolean result1 = true;
		
		Assert.assertFalse(result1);
		Reporter.log("result1 is true",true);
	}
	
	
}
