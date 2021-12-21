package co.com.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestThirdStep {

    public static final Target COMPUTER_INPUT = Target.the("where do we select the computer").located(By.xpath(
            "//div [@class, 'form-group col-xs-12 text-right']//span [@class, 'ui-select-match-text pull-left ui-select-allow-clear']"
    ));

    public static final Target VERSION_INPUT = Target.the("where do we select the version computer").located(By.xpath(
            "//div [@class, 'form-group col-xs-12 text-right']//a [@class, 'ui-select-match-text pull-left ui-select-allow-clear']"
    ));

    public static final Target LANGUAJE_PASSWORD = Target.the("where do we write the languaje").located(By.xpath(
            "//div [@class, 'form-group col-xs-12 text-right']//a [@class, 'ui-select-match-text pull-left ui-select-allow-clear']"
    ));

    public static final Target MOBILE_SELECT = Target.the("where do we select the fhone").located(By.xpath(
            "//div [@class, 'ui-select-match']//span [@class, 'btn btn-blue']"
    ));

    public static final Target MODEL_SELECT = Target.the("where do we select the model fhone").located(By.xpath(
            "//div [@class, 'ui-select-match']//span [@class, 'ui-select-placeholder text-muted']"
    ));

    public static final Target OPERATING_SELECT = Target.the("where do we select the system operative").located(By.xpath(
            "//div [@class, 'ui-select-match']//span [@class, 'ui-select-placeholder text-muted']"
    ));

    public static final Target NEXT_BUTTON = Target.the("button to continue with the next record").located(By.xpath(
            "//div [@class, 'pull-right next-step']//a [@class, 'Next - final step']"
    ));
}
