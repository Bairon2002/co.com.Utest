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
    public void setStage () {OnStage.setTheStage(new OnlineCast()); }

    @Given("^Bairon Alfonso wants to make an automation in the Utest$")
    public void bairon_Alfonso_wants_to_make_an_automation_in_the_Utest() {
        OnStage.theActorCalled("Bairon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }


    @When("^looking for the (.*) option on the Utest platform$")
    public void looking_for_the_community_page_option_on_the_Utest_platform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^find the option for (.*)$")
    public void find_the_option_for_community_page(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
