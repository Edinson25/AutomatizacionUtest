package co.com.choucair.Utest.tasks;

import co.com.choucair.Utest.model.User_Data;
import co.com.choucair.Utest.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;


public class CompleteInfoUser implements Task {
    private List<User_Data> information;

    public CompleteInfoUser(List<User_Data> information) {
        this.information = information;
    }

    public static CompleteInfoUser thePage(List<User_Data> information) {
        return Tasks.instrumented(CompleteInfoUser.class, information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(information.get(0).getStrName()).into(RegisterPage.NAME),
                Enter.theValue(information.get(0).getStrLastName()).into(RegisterPage.LASTNAME),
                Enter.theValue(information.get(0).getStrEmail()).into(RegisterPage.EMAIL),
                SelectFromOptions.byVisibleText(information.get(0).getStrMonthBirth()).from(RegisterPage.MONTHBIRTH),
                SelectFromOptions.byVisibleText(information.get(0).getStrDayBirth()).from(RegisterPage.DAYBIRTH),
                SelectFromOptions.byVisibleText(information.get(0).getStrYearBirth()).from(RegisterPage.YEARBIRTH),
                Click.on(RegisterPage.BUTTON_LOCATION)
        );


    }
}
