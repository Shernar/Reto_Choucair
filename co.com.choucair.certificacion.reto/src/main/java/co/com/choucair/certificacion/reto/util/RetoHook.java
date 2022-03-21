package co.com.choucair.certificacion.reto.util;

import cucumber.api.java.Before;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetoHook {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }
}
