
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/main/resources/features/AmazonTest.feature"}, glue = {"java"},
        plugin = {})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
