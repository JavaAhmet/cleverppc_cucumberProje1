package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YasinLocators extends Parent{

    public YasinLocators() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath = "(//a[text()='Dresses'])[2]")
    public WebElement dressesBtn;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement ustList;

    @FindBy(xpath = "(//div[@class='product-count'])[2]")
    public WebElement altList;


    @FindBy(xpath = "//span[@class=' label-success']")
    public List<WebElement> urunSayi;
}
