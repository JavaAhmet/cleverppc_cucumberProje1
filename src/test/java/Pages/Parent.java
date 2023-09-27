package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    public void myClick(WebElement element) {
        // butonu tıklatacağın zaman hangi aşamalar lazım
        //wait clickable olana kadar bekle
        //scrollunu yap
        //click
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();

    }

    public void mySendKeys(WebElement element, String yazi) {
        //bir textbox sağlıklı çalışması için hangi aşamalar
        //visible olana kadar bekle
        //scrollunu yap
        //clear yap
        //yazıyı gönder
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);

    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        //js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        //action la esc ye basarak açık kutucuk veya mesaj var ise kapat
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform(); // driver üzerinden action sınıfı oluşturdum.

        //Actions aksiyonlar=new Actions(GWD.getDriver());
        //Actions aksiyon=Aksiyonlar.sendKeys(Keys.ESCAPE).build;
        //aksiyon.perform();

    }
}
