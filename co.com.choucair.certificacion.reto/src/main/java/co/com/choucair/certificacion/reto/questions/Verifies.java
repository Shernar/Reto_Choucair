package co.com.choucair.certificacion.reto.questions;

import co.com.choucair.certificacion.reto.userinterface.RegisterInformation;
import co.com.choucair.certificacion.reto.userinterface.VerifiesRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class Verifies implements Question<Boolean> {

    private String message;

    public Verifies(String message){
        this.message = message;
    }

    public static Verifies the(String message) {
        return new Verifies(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean answer;

        actor.attemptsTo(Click.on(VerifiesRegister.WEBTABLE));

        String text = Text.of(VerifiesRegister.MESSAGE).viewedBy(actor).asString();

        if (message.equals(text)){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}
