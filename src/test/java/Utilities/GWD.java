package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GWD {

    private static WebDriver driver;
    //başına aşağıda new yapılmadan kullanılmasın
    // diye private özel yaptık
    public static WebDriver getDriver(){
        if (driver==null) // ilk kez 1 defa çalışsın
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
            // driver.manage().timeouts().implicitlyWait
            // (Duration.ofSeconds(25));ihtiyaç yok
        }
        return driver;
    }

    public static void quiteDriver(){
        // test sonucu ekranda bir miktar beklesin diye
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        // direver kapat
        if (driver!=null){ // driver dolu ise (var ise)
            driver.quit();
            driver=null;

        }
    }
}
