package com.co.choucair.stepdefinitions;

import com.co.choucair.tasks.Login;
import com.co.choucair.tasks.OpenPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PurchasesStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the user logs in successfully")
    public void thatTheUserLogsInSuccessfully() {
        Actor user = OnStage.theActorCalled("Dianis");
        user.attemptsTo(OpenPage.theApp("https://www.saucedemo.com/"),
                Login.onTheSite("standard_user","secret_sauce"));

    }
    @When("they add all products")
    public void theyAddAllProducts() {

    }
    @When("they enter the purchase details")
    public void theyEnterThePurchaseDetails() {

    }
    @Then("the successful purchase will be verified")
    public void theSuccessfulPurchaseWillBeVerified() {

    }
}
