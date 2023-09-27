package StepDefinitions;

import Pages.denizLocaters;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;

import java.util.List;


public class _02_LoginSteps {
    denizLocaters dl = new denizLocaters();
    @When("Send keys email as {string} password as {string}")
    public void sendKeysEmailAsPasswordAs(String useremail, String userpassword) {
        dl.mySendKeys(dl.userEmail, useremail);
        dl.mySendKeys(dl.userPassword, userpassword);
        dl.myClick(dl.userSignInBtn);
    }

    @Then("Fail message should be displayed")
    public void failMessageShouldBeDisplayed() {
        dl.verifyContainsText(dl.failMsg,"failed");
    }

    @Then("Password required message should be displayed")
    public void passwordRequiredMessageShouldBeDisplayed() {

        dl.verifyContainsText(dl.passwordRequiredMsg,"Password is required");
    }

    @Then("Email required message should be displayed")
    public void emailRequiredMessageShouldBeDisplayed() {
        dl.verifyContainsText(dl.emailRequiredMsg,"email address required");
    }

    @Then("Welcome message should be displayed")
    public void welcomeMessageShouldBeDisplayed() {

        dl.verifyContainsText(dl.welcomeMsg, "Welcome");
    }


}
