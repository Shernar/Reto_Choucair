package co.com.choucair.certificacion.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VerifiesRegister extends PageObject {

    public static final Target WEBTABLE = Target.the("Webtable")
            .located(By.xpath("//a[contains(text(),'WebTable')]"));
    public static final Target MESSAGE = Target.the("Verification Message")
            .located(By.xpath("//h4[1]"));
}
