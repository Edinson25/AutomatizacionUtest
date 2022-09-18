package co.com.choucair.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



public class ChoucairRegisterPage extends PageObject {
    public static final net.serenitybdd.screenplay.targets.Target REGISTER_BUTTON= Target.the("button that shows us the form to Register")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
