package co.com.choucair.Utest.stepdefinitions;

import co.com.choucair.Utest.model.User_Data;
import co.com.choucair.Utest.questions.Answer;
import co.com.choucair.Utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChoucairUtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Edinson wants to register on the Utest page$")
    public void EdinsonwantstoregisterontheUtestpage() {
       theActorCalled("Edinson").wasAbleTo(OpenUp.thePage(),
               Register.onThePage());
    }

    @When("^Enter all the required information$")
    public void Enteralltherequiredinformation(List<User_Data> information) throws Exception{
        theActorInTheSpotlight().attemptsTo(CompleteInfoUser.thePage(information),
                CompleteInfoLocation.thePage(information),
                CompleteInfoDevices.thePage(information),
                CompleteInfoPassword.thePage(information)
                );

    }

    @Then("^registration is completed successfully$")
    public void registrationiscompletedsuccessfully(List<User_Data>information) throws  Exception{
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(information)));
    }

}
