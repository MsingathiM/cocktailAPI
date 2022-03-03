package runner;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="features",
        glue= "featureSteps",
        plugin={"json:target/cucumber.json","pretty","html:target/cucumber-reports"}
)

public class TestRunnerNew {

    //class call runs all feature files and generates a small execution report
}

