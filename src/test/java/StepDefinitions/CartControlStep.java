package StepDefinitions;

import Utilities.GWD;
import Pages.ipekLocater;
import io.cucumber.java.en.*;


public class CartControlStep {

    ipekLocater iLoc = new ipekLocater();




   /* @Given("Navigate to Cleverppc")
    public void navigateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }
*/
    @When("Click to sign in and enter valid email and password and click sign in")
    public void clickToSignInAndEnterValidEmailAndPasswordAndClickSignIn() {
        iLoc.myClick(iLoc.signIn);
        iLoc.mySendKeys(iLoc.emailBox, "abc@gmail.com");
        iLoc.mySendKeys(iLoc.passwordBox, "abcd1234.");
        iLoc.myClick(iLoc.signInButton);
    }


    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        iLoc.verifyContainsText(iLoc.signOut, "out");
    }


    @And("Click to Dresses")
    public void clickToDresses() {
        iLoc.myClick(iLoc.dresses);
    }

    @And("Click to Add to card and continue shopping")
    public void clickToAddToCardAndContinueShopping() {
        int random1=iLoc.random();
        iLoc.myClickScript(iLoc.AllProuducts.get(random1));
        iLoc.myClick(iLoc.continueShopping);
        iLoc.added.add(iLoc.AllProuducts.get(random1).getAttribute("data-id-product"));

        int random2=iLoc.random();
        while (random1==random2){
            random2=iLoc.random();
        }
        iLoc.myClickScript(iLoc.AllProuducts.get(random2));
        iLoc.myClickScript(iLoc.continueShopping);
        iLoc.added.add(iLoc.AllProuducts.get(random2).getAttribute("data-id-product"));

        int random3=iLoc.random();
        while (random3==random1 || random3==random2){
            random3=iLoc.random();
        }
        iLoc.myClickScript(iLoc.AllProuducts.get(random3));
        iLoc.myClick(iLoc.continueShopping);
        iLoc.added.add(iLoc.AllProuducts.get(random3).getAttribute("data-id-product"));

        iLoc.myClick(iLoc.card);


    }

    @Then("Verify products and product amount")
    public void verifyProductsAndProductAmount() {
        int a=1;
        for (int i = 0; i <iLoc.inCardProuducts.size() ; i++) {
            for (int j = 0; j <iLoc.added.size(); j++) {
                if(iLoc.inCardProuducts.get(i).getText().contains(iLoc.added.get(j))){
                    System.out.println(a+". Ürün Eşleşti! Ürün kodu: "+iLoc.added.get(j));
                    a++;
                }
            }
        }
        iLoc.verifyContainsText(iLoc.productAmount,"3");
       }
}


