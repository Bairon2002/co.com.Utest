package co.com.Utest.tasks;

import co.com.Utest.userinterface.UtestLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends  Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLogin.LOGIN_BUTTON),
                Enter.theValue("IngresaTuCorreo").into(UtestLogin.INPUT_USER),
                Enter.theValue("IngresaTuContraseña").into(UtestLogin.INPUT_PASSWORD),
                Click.on(UtestLogin.ENTER_BUTTON));

    }
}
