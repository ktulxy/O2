package Page.Zdorovie;

import Driver.BrowseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Driver.BrowseDriver.driver;

public class Corona {

    public static  WebElement birthDay = driver.findElement(By.xpath("//input[@id='6558SubjectInsuredBirthDate']"));
    public static  WebElement order = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='saveGoAgreemntButton']"))));
    public static WebElement program = driver.findElement(By.xpath("//div[6]/div[2]/div/div/button/span/span"));
    public static WebElement programSum = driver.findElement(By.xpath("//div[6]/div[2]/div/div/div/div/input")); // 40тисяч


   public class Coronavirus extends BrowseDriver {

         public static WebElement choice = driver.findElement(By.xpath("//div[5]/div[3]/div/input[2]")); //Выбираем короназахист+

    }
    public static void coronaData(String date, String progSum){
        birthDay.click();
        birthDay.sendKeys(date + Keys.ENTER);
        program.click();
        programSum.sendKeys(progSum + Keys.ENTER, Keys.ESCAPE );
    }
    public static String isDogovor(){
       WebElement dogovor = driver.findElement(By.xpath("//*/text()[normalize-space(.)='Параметри договору']/parent::*"));
          String isTrueDogovor = dogovor.getText();
          return isTrueDogovor;

    }
    public static String confirmation(){
      WebElement signing = driver.findElement(By.xpath("//p[contains(.,'Для підписання договору відправте СМС-код на номер телефону страхувальника')]"));
      String isTrueSigning = signing.getText();
      return isTrueSigning;
    }
}
