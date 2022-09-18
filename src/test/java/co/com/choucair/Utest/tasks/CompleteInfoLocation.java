package co.com.choucair.Utest.tasks;

import co.com.choucair.Utest.model.User_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.Utest.userinterface.LocationPage.*;

public class CompleteInfoLocation implements Task {
    private List <User_Data> information;

    public static CompleteInfoLocation thePage(List<User_Data> information) {
        return Tasks.instrumented(CompleteInfoLocation.class, information);
    }

    public CompleteInfoLocation(List<User_Data> information) {
        this.information = information;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(information.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(information.get(0).getStrPostalCode()).into(COD_POSTAL),
                Click.on(CONTAINER_COUNTRY),
                Enter.theValue(information.get(0).getStrCountry()).into(COUNTRY),
                Hit.the(Keys.ENTER).into(COUNTRY),
                Click.on(BUTTON_DEVICES)
        );
    }
}
