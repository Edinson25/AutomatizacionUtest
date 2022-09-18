package co.com.choucair.Utest.tasks;

import co.com.choucair.Utest.model.User_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.Utest.userinterface.DevicesPage.*;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class CompleteInfoDevices implements Task {

  private List<User_Data> information;

    public CompleteInfoDevices(List<User_Data> information) {
        this.information = information;
    }

    public static CompleteInfoDevices thePage(List<User_Data> information) {
        return Tasks.instrumented(CompleteInfoDevices.class, information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTAINER_PC),
                Enter.theValue(information.get(0).getStrPC()).into(PC).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINER_VERSION),
                Enter.theValue(information.get(0).getStrVersionPC()).into(VERSION_PC).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINER_LANGUAGE),
                Enter.theValue(information.get(0).getStrLanguagePC()).into(LANGUAGE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINER_SMARTPHONE),
                Enter.theValue(information.get(0).getStrSmartPhone()).into(SMARTPHONE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINER_MODELO),
                Enter.theValue(information.get(0).getStrSmartPhoneModel()).into(SMARTPHONE_MODEL).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTAINER_SMARTPHONE_SO),
                Enter.theValue(information.get(0).getStrSmartPhone_So()).into(SMARTPHONE_SO).thenHit(ARROW_DOWN, ENTER),
                Click.on(BUTTON_LASTSTEP)
        );
    }
}
