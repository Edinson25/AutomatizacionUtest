package co.com.choucair.Utest.questions;

import co.com.choucair.Utest.model.User_Data;
import co.com.choucair.Utest.userinterface.PasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import java.util.List;

public class Answer implements Question<Boolean>{

    private List<User_Data> information;

    public Answer(List<User_Data> information) {
        this.information = information;
    }

    public static Answer toThe(List<User_Data> information) {
        return new Answer(information);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto_boton_final = Text.of(PasswordPage.BUTTON_TEXT).viewedBy(actor).asString();
        return information.get(0).getStrFinalText().equals(texto_boton_final);

    }
}
