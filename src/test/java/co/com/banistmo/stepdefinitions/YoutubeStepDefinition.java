package co.com.banistmo.stepdefinitions;

import co.com.banistmo.questions.PageValidation;
import co.com.banistmo.task.WritingBar;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.runner.RunWith;

import static co.com.banistmo.util.WebDriver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class YoutubeStepDefinition {

    @Before
    public void init(){setTheStage(OnlineCast.ofStandardActors());}

    @Given("^the user need to enter the google page$")
    public void the_user_need_to_enter_the_google_page() throws Throwable {
        theActorCalled("user");
        theActorInTheSpotlight().can(BrowseTheWeb.with(chrome()));

    }

    @When("^the user search the infomation travel$")
    public void the_user_search_the_infomation_travel() throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                WritingBar.SearchBar()
        );


    }

    @Then("^the user should see the icon youtube$")
    public void the_user_should_see_the_icon_youtube() throws Throwable {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(PageValidation.isVisible()));

    }
}
