package co.com.Utest.tasks;

import co.com.Utest.userinterface.UtestSecondStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Secondstep implements Task {


    public static Secondstep onThePage() {return Tasks.instrumented(Secondstep.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSecondStep.NEXT_BUTTON),
                Enter.theValue("IngresaTuMes").into(UtestSecondStep.CITY_INPUT),
                Enter.theValue("IngresaTuDia").into(UtestSecondStep.POSTAL_INPUT),
                Enter.theValue("IngresaTuAño").into(UtestSecondStep.COUNTRY_PASSWORD),
                Click.on(UtestSecondStep.NEXT_BUTTON));
    }

}
