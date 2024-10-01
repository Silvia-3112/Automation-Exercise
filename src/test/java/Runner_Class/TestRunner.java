package Runner_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Feature"},
        glue={"StepDefinition12"},
        dryRun = false,
        snippets=CucumberOptions.SnippetType.CAMELCASE,
        tags="@Task12"
)
public class TestRunner {

}
