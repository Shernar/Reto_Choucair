package co.com.choucair.certificacion.reto.interactions;

import co.com.choucair.certificacion.reto.model.entity.InformationEntity;
import co.com.choucair.certificacion.reto.userinterface.RegisterInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class SelectHobbies implements Interaction {

    public static SelectHobbies from(){
        return new SelectHobbies();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (InformationEntity.getInformation().getHobbies().contains("Cricket")) {
            actor.attemptsTo(Click.on(RegisterInformation.HOBBIES_CRICKET));
        }
        if (InformationEntity.getInformation().getHobbies().contains("Movies")) {
            actor.attemptsTo(Click.on(RegisterInformation.HOBBIES_MOVIES));
        }
        if (InformationEntity.getInformation().getHobbies().contains("Hockey")) {
            actor.attemptsTo(Click.on(RegisterInformation.HOBBIES_HOCKEY));
        }
    }
}
