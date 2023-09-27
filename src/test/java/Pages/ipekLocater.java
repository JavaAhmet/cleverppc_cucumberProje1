package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class ipekLocater extends Parent {

    public ipekLocater() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailBox;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
    public WebElement signInButton;
    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    public WebElement dresses;

    @FindBy(xpath = "(//a[@title='Add to cart'])[1]")
    public WebElement addtoCart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    public WebElement continueShopping;

    @FindBy(xpath = "(//a[@title='Add to cart'])[2]")
    public WebElement addtoCart2;

    @FindBy(xpath = "(//a[@title='Add to cart'])[3]")
    public WebElement addtoCart3;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
    public WebElement card;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/h1/span")
    public WebElement productAmount;
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/p/a")
    public WebElement product1;

   @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    public WebElement signOut;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[1]/div/div[2]/h5")
    public WebElement hover1;
    @FindBy(xpath = "//*[@id=\"product_list\"]/li[2]/div/div[2]/h5/a")
    public WebElement hover2;

    @FindBy(xpath = "//*[@id=\"product_list\"]/li[3]/div/div[2]/h5/a")
    public WebElement hover3;



   @FindBy(xpath = "//small[@class='cart_ref']")
   public List<WebElement> inCardProuducts;
    @FindBy(xpath = "//a[@title='Add to cart']")
    public List<WebElement> AllProuducts;

   public List<String> added= new ArrayList<>();
    public void myClickScript(WebElement element) {


        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        scrollToElement(element);
        //wait.until(ExpectedConditions.elementToBeClickable(element));
        js.executeScript("arguments[0].click();", element );
    }
    public void hover(WebElement element) {
        Actions action= new Actions(GWD.getDriver());
        action.moveToElement(element).build().perform();
    }
    public int random(){
       return (int) (Math.random() * AllProuducts.size());
    }

}
