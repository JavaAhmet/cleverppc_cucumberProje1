package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugrahanLocators extends Parent{
    public BugrahanLocators() {
        {

            PageFactory.initElements(GWD.getDriver(), this);
        }
    }
  // @FindBy(css = "[class='login']")
  // public WebElement signIn;

  // @FindBy(css = "[id='email']")
  // public WebElement eMail;

  // @FindBy(css = "[id='passwd']")
  // public WebElement password;

  // @FindBy(css = "[id='SubmitLogin']")
  // public WebElement loginButonu;

    @FindBy(css = "[title='Sitemap']")
    public WebElement siteMap;

    @FindBy(css = "div[class='block myaccount-column'] [title='My addresses']")
    public WebElement adresses;

    @FindBy(css = "[title='Add an address']")
    public WebElement adresEkleButonu;

    @FindBy(css = "[id='company']")
    public WebElement company;

    @FindBy(css = "[id='address1']")
    public WebElement adress1;

    @FindBy(css = "[id='address2']")
    public WebElement adress2;

    @FindBy(css = "[id='city']")
    public WebElement city;

    @FindBy(css = "[id='uniform-id_state']")
    public WebElement state;

    @FindBy(css = "div[id='uniform-id_state'] [id='id_state'] [value='1']")
    public WebElement stateSecim;

    @FindBy(css = "[id='postcode']")
    public WebElement postcode;

    @FindBy(css = "[id='phone']")
    public WebElement homePhone;

    @FindBy(css = "[id='phone_mobile']")
    public WebElement mobilPhone;

    @FindBy(css = "[id='other']")
    public WebElement informaiton;

    @FindBy(css = "[id='submitAddress']")
    public WebElement saveButonu;

    @FindBy(css = "div[class='addresses'] [class='dark']")
    public WebElement adreslerinListesiYazisi;

    @FindBy(css = "[class='logo img-responsive']")
    public WebElement anaSayfayaDonusButonu;

}
