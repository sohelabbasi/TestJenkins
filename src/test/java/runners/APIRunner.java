package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features  = "src/test/resources/features/",
        //glue is used to stick step defs with scenarios
        glue = "APISteps",
        //when you set the value of dry run to true, it stops actual execution
        //and it quickly scans all the steps whether the step defs are implemented or not
        //if step def is missing, it will provide step def for particular step
        dryRun = false,
        tags = "@api",
        plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json",
                "rerun:target/failed.txt"}
)

public class APIRunner {
}
