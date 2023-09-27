package StepDefinitions;

import Pages.YasinLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _05_ControlList {
    YasinLocators yl=new YasinLocators();

    @When("User Clicks on the dresses category")
    public void userClicksOnTheDressesCategory() {

        yl.myClick(yl.dressesBtn);





    }

    @Then("Validating the number at the top of the list")
    public void validatingTheNumberAtTheTopOfTheList() {
        Assert.assertTrue(yl.ustList.getText().contains("5"));
    }


    @And("Validating the number at the buttom of the list")
    public void validatingTheNumberAtTheButtomOfTheList() {
        Assert.assertTrue(yl.altList.getText().contains("5"));
    }

    @Then("Check the number by counting list products")
    public void checkTheNumberByCountingListProducts() {
        Assert.assertTrue(yl.urunSayi.size()==5);
    }
}
