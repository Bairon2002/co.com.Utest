package co.com.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLogin extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the from to login").located(By.xpath(
            "//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(), 'Log In')]"
    ));

    public static final Target INPUT_USER = Target.the("where do we write the email").located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("button to confir login").located(By.id("kc-login"));
}
