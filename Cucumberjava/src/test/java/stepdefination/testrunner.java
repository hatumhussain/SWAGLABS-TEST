package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\Cucumberjava\\src\\test\\resources\\Features",glue= {"stepdefination"},
monochrome = true,
plugin={"pretty","html:target/HTMLReport"}
		)
public class testrunner {

}
