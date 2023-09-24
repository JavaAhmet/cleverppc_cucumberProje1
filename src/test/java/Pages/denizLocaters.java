package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class denizLocaters extends Parent{

    public denizLocaters() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[@class='login']")
    public WebElement signIn;

    @FindBy(xpath="//input[@id='email_create']")
    public WebElement createAccount;

    @FindBy(xpath="//button[@id='SubmitCreate']")
    public WebElement createAccountBtn;

    @FindBy(xpath="//input[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath="//input[@id='customer_lastname']")
    public WebElement lastName;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath="//button[@id='submitAccount']")
    public WebElement registerBtn;

    @FindBy(xpath="//p[@class='alert alert-success']")
    public WebElement successMsg;

    /*************/

    @FindBy(xpath="//input[@id='email']")
    public WebElement userEmail;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement userPassword;

    @FindBy(xpath="//button[@id='SubmitLogin']")
    public WebElement userSignInBtn;



    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "signIn": return this.signIn;
            case "createAccount": return this.createAccount;
            case "createAccountBtn": return this.createAccountBtn;
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "email": return this.email;
            case "password": return this.password;
            case "registerBtn": return this.registerBtn;
            case "successMsg": return this.successMsg;
            case "userEmail": return this.userEmail;
            case "userPassword": return this.userPassword;
            case "userSignInBtn": return this.userSignInBtn;
        }

        return null;
    }
}



