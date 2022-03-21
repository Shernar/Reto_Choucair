package co.com.choucair.certificacion.reto.tasks;

import static co.com.choucair.certificacion.reto.util.Constants.*;

import co.com.choucair.certificacion.reto.interactions.SelectHobbies;
import co.com.choucair.certificacion.reto.interactions.SelectLanguages;
import co.com.choucair.certificacion.reto.model.entity.InformationEntity;
import co.com.choucair.certificacion.reto.userinterface.RegisterInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import java.util.List;

public class Register implements Task {

    private List<String> information;

    public Register(List<String> information) {
        this.information = information;
    }

    public static Register the(List<String> information) {
        return new Register(information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        InformationEntity.setInformation(information);


        actor.attemptsTo(Enter.theValue(InformationEntity.getInformation().getFirst_name()).into(RegisterInformation.FIRST_NAME),
                Enter.theValue(InformationEntity.getInformation().getLast_name()).into(RegisterInformation.LAST_NAME),
                Enter.theValue(InformationEntity.getInformation().getAddress()).into(RegisterInformation.ADDRESS),
                Enter.theValue(InformationEntity.getInformation().getEmail_address()).into(RegisterInformation.EMAIL_ADRRESS),
                Enter.theValue(InformationEntity.getInformation().getPhone()).into(RegisterInformation.PHONE),
                Check.whether(InformationEntity.getInformation().getGender().trim().equals(MALE))
                        .andIfSo(Click.on(RegisterInformation.GENDER_MALE))
                        .otherwise(Click.on(RegisterInformation.GENDER_FEMALE)),
                SelectHobbies.from());
        Scroll.to(RegisterInformation.LANGUAGES).performAs(actor);
        actor.attemptsTo(Click.on(RegisterInformation.LANGUAGES),
                SelectLanguages.from(RegisterInformation.LIST_LANGUAGES, InformationEntity.getInformation().getLanguages(), COMA),
                Click.on(RegisterInformation.WHITE_AREA),
                SelectFromOptions.byVisibleText(InformationEntity.getInformation().getSkills()).from(RegisterInformation.SKILLS),
 //               SelectFromOptions.byVisibleText(InformationEntity.getInformation().getCountry()).from(RegisterInformation.COUNTRY),
                Click.on(RegisterInformation.SELECT_COUNTRY_1),
                Enter.theValue(InformationEntity.getInformation().getSelect_country()).into(RegisterInformation.SELECT_COUNTRY_2).thenHit(Keys.ENTER),
                SelectFromOptions.byVisibleText(InformationEntity.getInformation().getYear()).from(RegisterInformation.YEAR),
                SelectFromOptions.byVisibleText(InformationEntity.getInformation().getMonth()).from(RegisterInformation.MONTH),
                SelectFromOptions.byVisibleText(InformationEntity.getInformation().getDay()).from(RegisterInformation.DAY),
                Enter.theValue(InformationEntity.getInformation().getPassword()).into(RegisterInformation.PASSWORD),
                Enter.theValue(InformationEntity.getInformation().getConfirm_password()).into(RegisterInformation.CONFIRM_PASSWORD)
//                Click.on(RegisterInformation.SUBMIT)
        );
    }
}
