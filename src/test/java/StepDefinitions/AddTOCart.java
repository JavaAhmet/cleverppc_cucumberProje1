package StepDefinitions;

import Pages.EsinLocator;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.GWD.getDriver;


public class AddTOCart {


    EsinLocator dc = new EsinLocator();

    @Given("Navigate to CleverPPC")
    public void navigate_to_CleverPPC() {
        //System.out.println("site açıldı");
        getDriver().get("https://cleverppc.com/prestashop4/");

    }


    @And("click SignIn button and enter email and enter password and click Sign in button")
    public void clickSignInButtonAndEnterEmailAndEnterPasswordAndClickSignInButton() {
        dc.myClick(dc.SignIn);
        dc.mySendKeys(dc.email, "es12345@gmail.com");
        dc.mySendKeys(dc.password, "as123453");
        dc.myClick(dc.signIn);

    }


    @And("navigate to summer dresses")
    public void navigateToSummerDresses() {


        Actions actions = new Actions(getDriver());
        Action act = actions.moveToElement(dc.WomenMenu).build();
        act.perform();
        dc.myClick(dc.SummerDresses);
    }

    @When("user selects a random dress and click add to cart button")
    public void userSelectsARandomDressAndClikAddToCartButton() {

        Actions actions = new Actions(getDriver());
        Action act = actions.moveToElement(dc.RndDress).build();
        act.perform();
        //dc.myClick(dc.AddToCrt);
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", dc.AddToCrt );
    }




    @And("product should be successfully added to the cart")
    public void productShouldBeSuccessfullyAddedToTheCart() {

        dc.verifyContainsText(dc.successMessage, "successfully");
    }

}

