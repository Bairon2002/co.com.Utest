package co.com.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeachCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona la opcion").located(By.xpath(
            "//div[class='dashboard-activity-no-list-items']//a [contains(text(), 'Community Page')]"
    ));

    public static final Target LABEL_COURSE = Target.the("mira el titulo").located(By.xpath("//div [class='container-fluid']"));

    public static final Target NAME_COURSE = Target.the("Extrae el nombre del titulo").located(By.xpath(
            "//h2[contains(text(), 'Welcome back, Bairon Esteban Alfonso Amado')]"
    ));

}
