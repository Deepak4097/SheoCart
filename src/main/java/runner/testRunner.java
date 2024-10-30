package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( 
		features = "src/main/java/features",
		glue ={"utility","stepDefinition" },
		//plugin = {"pretty" ,"html:target/cucumber-html-report","json:target/cucumber.json"}
		 plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }
		)
		

public class testRunner {

}