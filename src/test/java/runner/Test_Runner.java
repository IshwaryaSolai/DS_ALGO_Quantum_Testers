package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
      
@CucumberOptions(
         plugin = {"pretty" , "html:target/ishu.html"},
		features = {"src/test/resources/features"}, //location of feature files
		glue= "stepdefinitions") //location of step definition files
		
					
public class Test_Runner extends AbstractTestNGCucumberTests{
	
	@Override
	   @DataProvider(parallel = true)
 public Object[][] scenarios() {
				
		return super.scenarios();
}
					
				}
				


