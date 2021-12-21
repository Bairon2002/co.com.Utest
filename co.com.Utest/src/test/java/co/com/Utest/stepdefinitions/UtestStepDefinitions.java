package co.com.Utest.stepdefinitions;

import co.com.Utest.questions.Answer;
import co.com.Utest.tasks.Login;
import co.com.Utest.tasks.OpenUp;
import co.com.Utest.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions<course> {

    private String course;

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Bairon Alfonso wants to make an automation on the Utest page for a person registration \\.\\.\\.$")
    public void bairon_Alfonso_wants_to_make_an_automation_on_the_Utest_page_for_a_person_registration() {
        OnStage.theActorCalled("Bairon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }


    @When("^looking for the Join Today option to be able to register the person \\.\\.\\.$")
    public void looking_for_the_Join_Today_option_to_be_able_to_register_the_person() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^Join Today look for all the fields and fill out the (.*) forms to be able to Log in$")
    public void join_Today_look_for_all_the_fields_and_fill_out_the_forms_to_be_able_to_Log_in(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
