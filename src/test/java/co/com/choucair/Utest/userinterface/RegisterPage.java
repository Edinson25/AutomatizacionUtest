package co.com.choucair.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    public static final Target NAME = Target.the("User name field").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("User Lastname field").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("User Emailname field").located(By.id("email"));
    public static final Target MONTHBIRTH = Target.the("User Month birth name field").located(By.id("birthMonth"));
    public static final Target DAYBIRTH = Target.the("User day birth field").located(By.id("birthDay"));
    public static final Target YEARBIRTH = Target.the("User year birth field").located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("Button next section Location")
            .located(By.xpath("//a[@class = 'btn btn-blue']"));
}
