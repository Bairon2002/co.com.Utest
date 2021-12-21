package co.com.Utest.tasks;

import co.com.Utest.userinterface.UtestFourthStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Fourdstep implements Task{


    public static Fourdstep onThePage() {return Tasks.instrumented(Fourdstep.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFourthStep.NEXT_BUTTON),
                Enter.theValue("IngresaTuNombre").into(UtestFourthStep.PASSWORD_INPUT),
                Enter.theValue("IngresaTuApellido").into(UtestFourthStep.PASSWORD_INPUT),
                Enter.theValue("IngresaTuCorreo").into(UtestFourthStep.TERM1_PASSWORD),
                Enter.theValue("IngresaTuMes").into(UtestFourthStep.TERM2_SELECT),
                Enter.theValue("IngresaTuDia").into(UtestFourthStep.TERM3_SELECT),
                Click.on(UtestFourthStep.NEXT_BUTTON));
    }
}
