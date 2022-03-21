package co.com.choucair.certificacion.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reto.feature",
        tags = "@RetoChoucair",
        glue = {"co.com.choucair.certificacion.reto.stepdefinitions", "co.com.choucair.certificacion.reto.util"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
