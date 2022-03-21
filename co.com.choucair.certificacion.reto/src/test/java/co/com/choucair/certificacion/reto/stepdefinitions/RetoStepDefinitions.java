package co.com.choucair.certificacion.reto.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.*;

import co.com.choucair.certificacion.reto.questions.Verifies;
import co.com.choucair.certificacion.reto.tasks.OpenUp;
import co.com.choucair.certificacion.reto.tasks.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

public class RetoStepDefinitions {

    @Given("^(.*) wants to access the Web Automation Demo Site$")
    public void santiagoWantsToAccessTheWebAutomationDemoSite(String Santiago) {
        theActorCalled(Santiago).wasAbleTo(OpenUp.thePageAutomationDemoSite());
    }

    @When("^he performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<String> information) {
        theActorInTheSpotlight().attemptsTo(Register.the(information));
    }

    @Then("^he verifies that the screen is loaded with text (.*)$")
    public void heVerifiesThatTheScreenIsLoadedWithTextDoubleClickOnEditIconToEDITTheTableRow(String messaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verifies.the(messaje)));
    }
}
