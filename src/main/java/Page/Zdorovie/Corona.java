package Page.Zdorovie;

import Driver.BrowseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Corona {


    public class Coronavirus extends BrowseDriver {

        public static WebElement corona = driver.findElement(By.xpath("//div[5]/div/div/input[2]"));
      //  public static WebElement birthDay = driver.findElement(By.xpath("/input[@id='7319SubjectInsuredBirthDate']"));

    }
   public void coronaData(String date){
      //  Coronavirus.birthDay.sendKeys(date);
   }
}
