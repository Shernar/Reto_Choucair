package co.com.choucair.certificacion.reto.tasks;

import co.com.choucair.certificacion.reto.userinterface.AutomationDemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task{

    private AutomationDemoSitePage automationDemoSitePage;

    public static OpenUp thePageAutomationDemoSite() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationDemoSitePage));
    }
}
