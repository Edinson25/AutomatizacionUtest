package co.com.choucair.Utest.tasks;

import co.com.choucair.Utest.model.User_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.Utest.userinterface.PasswordPage.*;

public class CompleteInfoPassword implements Task{

    private  List <User_Data> information;

    public CompleteInfoPassword(List<User_Data> information) {
        this.information = information;
    }

    public static CompleteInfoPassword thePage(List<User_Data> information) {
        return Tasks.instrumented(CompleteInfoPassword.class, information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(information.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(information.get(0).getStrPassword()).into(PASSWORD_CONFIRM),
                Click.on(CHECKBOX_BE_INFORMED),
                Click.on(CHECKBOX_TERMS),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(BUTTON_COMPLETE_SETUP)
        );

    }
}
