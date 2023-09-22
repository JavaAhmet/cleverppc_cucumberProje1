package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
        // Sevgili PageFactory sen bu sayfanın
        // sahibisin,senden ricam aşağıdaki locatorları
        //ben kullanacağım zaman driver üzerinden
        // bulup başlatıp ,bana hazır et.
        //ben artık find element le uğraşmak
        //istemiyorum

    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text'")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),successfully')]")
    public WebElement successMesssage;
    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname='shortName')]//input")
    public WebElement ShortName;
    @FindBy(xpath = "//div[contains(text(),already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'NAME']//input[@data-placeholder='Name']")
    public WebElement searcInput;
    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
   /* public void deleteItem(String searchText){
        mySendKeys(searcInput,searchText);
        myClick(searchButton); // fuse bar ı çocukları ortaya çıkıyor
        //sayfanın yenilenmesini bekletecez

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        //beklet
        //1. yöntem-> StaleElement hatası verdi:erken buldum tez kaybettim.
        //dc.wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        //fuse-progress-bar/* ->fuse-progress-bar ın çocukları / çocuğu yıldız olursa çocukları
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"),0));
        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);



    }
    */
}
