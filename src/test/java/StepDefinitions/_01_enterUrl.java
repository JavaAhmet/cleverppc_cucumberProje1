package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.*;


public class _01_enterUrl {
    @Given("Navigate to Cleverppc")
    public void navigateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }


}
