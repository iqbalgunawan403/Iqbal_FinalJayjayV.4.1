package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:reports/cucumber-web-report.html"},
        glue = {"stepDef"},
        features = {"src/test/resources/features"},
        tags = "@web"
)
public class WebRunner {
}
