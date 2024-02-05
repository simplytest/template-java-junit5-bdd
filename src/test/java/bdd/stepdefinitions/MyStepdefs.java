package bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("this works as intended")
    public void thisWorksAsIntended() {
        System.out.println("as intended");
    }

    @When("the test runner is called")
    public void theTestRunnerIsCalled() {
        System.out.println("and running");
    }

    @Then("this lines are executed")
    public void thisLinesAreExecuted() {
        System.out.println("with finish");
    }
}
