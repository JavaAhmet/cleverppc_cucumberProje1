package StepDefinitions;

import Pages._08_ahmetLocator;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _08_WebMailSend  {
        _08_ahmetLocator dc=new _08_ahmetLocator();



    @When("Click to element contact us")
    public void clickToElementContactUs() {
            dc.myClick(dc.contactUsButton);
    }

    @And("Select to element SubjectHeading")
    public void selectToElementSubjectHeading() {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0, 200);");

        Select SelectSub = new Select(dc.SubjectHeading);
        SelectSub.selectByValue("1");

    }

    @And("User sending the keys in email")
    public void userSendingTheKeysInEmail() {
        dc.mySendKeys(dc.eMail, "gokcent433@gmail.com");
    }

    @And("User sending the keys in referansno")
    public void userSendingTheKeysInReferansno() {
        dc.mySendKeys(dc.referansNo,"demo_04");
    }

    @And("Click to element Choose File")
    public void clickToElementChooseFile() {
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();

        js.executeScript("arguments[0].click();", dc.fileSelectButton );
        //  dc.myClick(dc.fileSelectButton);
    }
    @And("Upload File with RobotClass")
    public void uploadFileWithRobotClass() throws AWTException {

        Robot robot = new Robot();
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\tefek\\OneDrive\\Masaüstü\\bankadekont.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @And("User sending the keys in message")
    public void userSendingTheKeysInMessage() {
      dc.mySendKeys(dc.message, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir."
                + "İsim= a. Soyisim= t.");
    }

    @And("Click to element send")
    public void clickToElementSend() {
        dc.myClick(dc.send);
    }


    @Then("Your message has been successfully")
    public void yourMessageHasBeenSuccessfully() {
        dc.verifyContainsText(dc.verifymessage, "successfully");
    }
}


