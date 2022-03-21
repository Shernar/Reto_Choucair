package co.com.choucair.certificacion.reto.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SelectLanguages implements Interaction {

    private Target list;
    private String option;
    private String Character;

    public SelectLanguages(Target list, String option, String Character) {
        this.list = list;
        this.option = option;
        this.Character = Character;
    }

    public static SelectLanguages from(Target list, String option, String Character){
        return new SelectLanguages(list, option, Character);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] separatorOption = option.split(""+Character+"");

        List<WebElementFacade> listObject = list.resolveAllFor(actor);
        for (int i = 0; i < listObject.size(); i++) {
            for (int j = 0; j < separatorOption.length; j++) {
                if (listObject.get(i).getText().trim().equals(separatorOption[j])) {
                    listObject.get(i).click();
                    break;
                }
            }
        }
    }
}
