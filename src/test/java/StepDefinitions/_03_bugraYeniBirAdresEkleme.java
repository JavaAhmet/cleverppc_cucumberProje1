package StepDefinitions;

import Pages.BugrahanLocators;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_bugraYeniBirAdresEkleme {

    BugrahanLocators b=new BugrahanLocators();

    //kodlarımın çalışması için login olunması gerek.
    @Given("Navigate to Cleverppc")
    public void navigateToCleverppc() {

        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click the sitemap button. Then click on the addresses button. Add a new address to the page that opens.")
    public void clickTheSitemapButtonThenClickOnTheAddressesButtonAddANewAddressToThePageThatOpens() throws InterruptedException {

      // b.myClick(b.signIn);                          -
      // b.mySendKeys(b.eMail,"deneme123@gmail.com");    -
      // b.mySendKeys(b.password,"deneme123");             ->  Login
      // b.myClick(b.loginButonu);                       -
        //                                             -
        b.myClick(b.siteMap);
        b.myClick(b.adresses);
        b.myClick(b.adresEkleButonu);
        b.mySendKeys(b.company, "TechnoStudy");
        b.mySendKeys(b.adress1, "den mh./den sk./no:35/kat:35/daire:64");
        b.mySendKeys(b.adress2,"den mh./den sk./no:36/kat:36/daire:66");
        b.mySendKeys(b.city,"deneme");
        b.myClick(b.state);
        Thread.sleep(1000);
        b.myClick(b.stateSecim);
        b.mySendKeys(b.postcode,"35000");
        b.mySendKeys(b.homePhone,"05333333333");
        b.mySendKeys(b.mobilPhone,"05444444444");
        b.mySendKeys(b.informaiton,"test aşaması");
        b.myClick(b.saveButonu);

    }



    @Then("The user should successfully add a new address.")
    public void theUserShouldSuccessfullyAddANewAddress() {

        b.verifyContainsText(b.adreslerinListesiYazisi,"Your addresses are listed below.");

        //testin geçmesi için adresses bölümünde hiç adres kaydı olmaması gerek. varsa çalıştırmadan silmeyi unutmayalım.

        GWD.quiteDriver(); // ->  merge edilince silenecek

       // b.myClick(b.anaSayfayaDonusButonu);  -> benden sonraki Sepete Ürün Ekleme testi için
        //                                        testler merge edilince aktif edilecek
    }
}
