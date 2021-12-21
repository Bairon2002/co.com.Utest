package co.com.Utest.tasks;

import co.com.Utest.userinterface.UtestThirdStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Thirdstep implements Task{


    public static Thirdstep onThePage() {return Tasks.instrumented(Thirdstep.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestThirdStep.NEXT_BUTTON),
                Enter.theValue("SeleccionaTuComputador").into(UtestThirdStep.COMPUTER_INPUT),
                Enter.theValue("SeleccionaLaVersion").into(UtestThirdStep.VERSION_INPUT),
                Enter.theValue("SeleccionaElLenguaje").into(UtestThirdStep.LANGUAJE_PASSWORD),
                Enter.theValue("SeleccionaTuCelular").into(UtestThirdStep.MOBILE_SELECT),
                Enter.theValue("SeleccionaElModelo").into(UtestThirdStep.MODEL_SELECT),
                Enter.theValue("SeleccionaSistemaOperador").into(UtestThirdStep.OPERATING_SELECT),
                Click.on(UtestThirdStep.NEXT_BUTTON));
    }

}
