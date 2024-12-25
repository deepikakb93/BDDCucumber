package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/SearchProduct.feature", glue="StepDefinitions",monochrome=true)
public class TestNGRunnertest extends AbstractTestNGCucumberTests{

	
}
