package org.practice.cucumber.step_definitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.practice.cucumber.transformers.TestTransformer;
import org.practice.cucumber.utils.BaseUtil;

import java.util.List;

public class PracticeDefinitions  extends BaseUtil {

    private BaseUtil base;

    public PracticeDefinitions(BaseUtil util){
        base = util;
    }

    @Given("^I have a test precondition$")
    public void iHaveATestPrecondition() {
        System.out.println("Given action 'I have a test precondition'\n");
    }

    @Then("^I should check results$")
    public void iShouldCheckResults() {
        System.out.println("Then action 'I should check results'\n");
    }

    @When("^I execute \"([^\"]*)\" step$")
    public void iExecuteStep(String someText) {
        String action = "Action 'I execute %s step'\n";
        System.out.println(String.format(action, someText));
    }

    @When("^I say ([^\"]*) and ([^\"]*)$")
    public void iSay2Words(String word1, String word2) {
        String action = "The followings will never? meet: %s and %s'\n";
        System.out.println(String.format(action, word1, word2));
    }

    @And("^I use some params$")
    public void iUseSomeParams(DataTable table) {
        List<Params> testData = table.asList(Params.class);
        String printTemplate = "Param1: %s; Param2: %s;";

        testData.forEach(param ->
                System.out.println(String.format(printTemplate, param.param1, param.param2)));

        System.out.println("");
    }

    @And("^I skip a line$")
    public void iSkipALine() {
        System.out.println("\n");
    }

    @And("^I can use dependency$")
    public void iCanUseDependency(){
        System.out.println("Dependency info: " + base.stepInfo + "\n");
    }

    @And("^I can use transformer:([^\"]*)")
    public void iCanUseTransformer(@Transform(TestTransformer.class) String testTransformer) {
        System.out.println("Transformer example: " + testTransformer + "\n");
    }

    @And("^I can read integer (\\d+)$")
    public void iCanReadInteger(int number) {
        System.out.println("Given number multiplied by 2 is " + number * 2 + "\n");
    }

    public class Params {
        public String param1;
        public String param2;

        public Params(String p1, String p2) {
            this.param1 = p1;
            this.param2 = p2;
        }
    }
}
