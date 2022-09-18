package co.com.choucair.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target CITY = Target.the("user city field").located(By.id("city"));
    public static final Target COD_POSTAL = Target.the("user Postal Code field").located(By.id("zip"));
    public static final Target CONTAINER_COUNTRY = Target.the("user Container Country field")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY = Target.the("user country field")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Button next section devices")
            .located(By.xpath("//a[@class = 'btn btn-blue pull-right']"));
}
