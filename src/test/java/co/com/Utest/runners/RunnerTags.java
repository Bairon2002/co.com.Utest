package co.com.Utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/Utest.feature",
        tags = "@Regresion",
        glue = "co.com.Utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}
