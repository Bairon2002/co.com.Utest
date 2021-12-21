package co.com.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFirstStep extends PageObject {

    public static final Target FIRST_INPUT = Target.the("where do we write the name").located(By.id("firstName"));

    public static final Target SECOND_INPUT = Target.the("where do we write the last name").located(By.id("password"));

    public static final Target THIRD_INPUT = Target.the("where do we write the email").located(By.id("email"));

    public static final Target MONHT_SELECT = Target.the("where we select the month").located(By.id("birthMonth"));

    public static final Target DAY_SELECT = Target.the("where we select the day").located(By.id("birthDay"));

    public static final Target YEAR_SELECT = Target.the("where we select the year").located(By.id("birthYear"));

    public static final Target NEXT_BUTTON = Target.the("button to continue with the next record").located(By.xpath(
            "//div [@class, 'form-group col-xs-12 text-right']//a [@class, 'btn btn-blue']"
    ));
}