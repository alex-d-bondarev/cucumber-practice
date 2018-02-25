package org.practice.cucumber.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background {
    @Given("^A background Given$")
    public void aBackgroundGiven() {
        System.out.println("= This is a background 'Given'\n");
    }

    @When("^A background When")
    public void aBackgroundWhen() {
        System.out.println("= This is a background 'When'\n");
    }

    @Then("^A background Then")
    public void aBackgroundThen() {
        System.out.println("= This is a background 'Then'\n");
    }
}
