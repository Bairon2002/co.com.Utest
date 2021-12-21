package co.com.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFourthStep {

    public static final Target PASSWORD_INPUT = Target.the("where do we write the password").located(By.id("password"));

    public static final Target COMFIRM_INPUT = Target.the("where do we write the confirm password").located(By.id("password"));

    public static final Target TERM1_PASSWORD = Target.the("this is where the terms are acceptedl").located(By.xpath(
            "//div [@class, 'row col-xs-12']//label [@class, 'input-check-box signup-consent signup-consent--highlight']"));

    public static final Target TERM2_SELECT = Target.the("this is where the terms are accepted").located(By.xpath(
            "//div [@class, 'frow col-xs-12']//label [@class, 'input-check-box signup-consent']" ));

    public static final Target TERM3_SELECT = Target.the("this is where the terms are accepted").located(By.xpath(
            "//div [@class, 'row col-xs-12']//label [@class, 'input-check-box signup-consent']"));

    public static final Target NEXT_BUTTON = Target.the("button that registers the user").located(By.xpath(
            "//div [@class, 'pull-right next-step']//a [@class, 'Complete Setup']"
    ));

}
