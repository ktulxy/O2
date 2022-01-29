package Page.Zdorovie;

import Driver.BrowseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Driver.BrowseDriver.driver;

public class Corona {


    public class Coronavirus extends BrowseDriver {

        public static WebElement coronaСhoice = driver.findElement(By.xpath("//div[@id='a1609846']/div/div/input[2]"));



    }
    public static void coronaData(String date){

        WebElement birthDay = driver.findElement(By.xpath("//input[@id='7319SubjectInsuredBirthDate']"));
        birthDay.sendKeys(date);

    }
}
