package co.com.choucair.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordPage {
    public static final Target PASSWORD = Target.the("Create user password field")
            .located(By.id("password"));
    public static final Target PASSWORD_CONFIRM = Target.the("Confirm user password field")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_BE_INFORMED = Target.the("Checkbox to be informed")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS = Target.the("Checkbox for terms of use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACY = Target.the("Checkbox for privacy and security")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("BUTTON FOR COMPLETE SETUP")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
    public static final Target BUTTON_TEXT= Target.the("BUTTON FOR COMPLETE SETUP")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
