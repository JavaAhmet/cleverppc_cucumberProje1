package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EsinLocator extends Parent {



    public EsinLocator() {
        PageFactory.initElements(GWD.getDriver(), this);
        // Sevgili PageFactory sen bu sayfanın
        // sahibisin, senden ricam aşağıdaki locatorları
        // ben kullanacağım zaman driver üzerinden
        // bulup başlatıp, bana hazır et.
        // ben artık find element le uğraşmak
        // istemiyorum.
    }

    @FindBy(xpath="//a[@class='login']")
    public WebElement SignIn;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath="//*[@id='SubmitLogin']")
    public WebElement signIn;

    @FindBy(xpath="//*[@id='center_column']/p/text()")
    public WebElement OnayMsj;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement WomenMenu;
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a")
    public WebElement SummerDresses;

    @FindBy(xpath ="//*[@id='product_list']/li[1]")
    public WebElement RndDress;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code' ]//input")
    public WebElement codeInput;
    @FindBy(xpath="//*[@id='product_list']/li[1]/div/div[2]/div[2]/a[1]/span")
    public WebElement AddToCrt;
    @FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/span[2]")
    public WebElement successMessage;

}
