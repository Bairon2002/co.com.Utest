package co.com.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSecondStep {

    public static final Target CITY_INPUT = Target.the("where do we write the city").located(By.id("city"));

    public static final Target POSTAL_INPUT = Target.the("where do we write the code postal").located(By.id("zip"));

    public static final Target COUNTRY_PASSWORD = Target.the("where do we write the country").located(By.xpath(
            "//div [@class, 'ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required auto-detected']//span [@class, 'ui-select-match-text pull-left']"
    ));

    public static final Target NEXT_BUTTON = Target.the("button to continue with the next record").located(By.xpath(
            "//div [@class, 'pull-right next-step']//a [@class, 'btn btn-blue pull-right']"
    ));

}
