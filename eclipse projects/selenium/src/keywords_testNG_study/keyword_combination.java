package keywords_testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_combination {
  @Test(priority = -2,dependsOnMethods = {"b"})
  public void a() {
	  Reporter.log("a is running",true);
  }
  @Test(priority = 1)
  public void b() {
	  Reporter.log("b is running",true);
  }
  @Test(priority = -1)
  public void c() {
	  Reporter.log("c is running",true);
  }
  @Test
  public void d() {
	  Reporter.log("d is running",true);
  }
}
