package co.com.Utest.tasks;

import co.com.Utest.userinterface.UtestFirstStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Firststep implements Task {

    public static Firststep onThePage() {return Tasks.instrumented(Firststep.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFirstStep.NEXT_BUTTON),
                Enter.theValue("IngresaTuNombre").into(UtestFirstStep.FIRST_INPUT),
                Enter.theValue("IngresaTuApellido").into(UtestFirstStep.SECOND_INPUT),
                Enter.theValue("IngresaTuCorreo").into(UtestFirstStep.THIRD_INPUT),
                Enter.theValue("IngresaTuMes").into(UtestFirstStep.MONHT_SELECT),
                Enter.theValue("IngresaTuDia").into(UtestFirstStep.DAY_SELECT),
                Enter.theValue("IngresaTuAño").into(UtestFirstStep.YEAR_SELECT),
                Click.on(UtestFirstStep.NEXT_BUTTON));
    }

}
