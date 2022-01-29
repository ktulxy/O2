package Page.Zdorovie;

import Driver.BrowseDriver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Driver.BrowseDriver.driver;

public class Corona {

    public static  WebElement birthDay = driver.findElement(By.xpath("//input[@id='7319SubjectInsuredBirthDate']"));

    public static  WebElement order = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='sumContainer']/input"))));
   // public static WebElement order = driver.findElement(By.xpath("//div[@id='sumContainer']/input"));

   public class Coronavirus extends BrowseDriver {

         public static WebElement choice = driver.findElement(By.xpath("//div[@id='a1609846']/div/div/input[2]"));

    }
    public static void coronaData(String date){
        birthDay.click();
        birthDay.sendKeys(date + Keys.ENTER);


    }
}
