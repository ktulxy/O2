package Zdorovie;

import Driver.BrowseDriver;
import Page.Login;
import Page.Zdorovie.Corona;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.Duration;
import static Page.Menu.Healthy;
import static Page.Zdorovie.Corona.*;
import static Page.Zdorovie.Corona.Coronavirus.choice;


public class CoronavirusUA extends BrowseDriver {

    @Test(priority = 1)
    public void Healthy(){
        driver.get("https://ais2test.ingo.ua/webcenter/system/login.jsp");
        Login lg = new Login();
        lg.initialize("omudritsky","123666456");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Healthy.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        choice.click();
    }

    @Test(priority = 2)
    public void data(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Corona.coronaData("01.01.2000");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions = new Actions(driver);
        actions.moveToElement(order);
        actions.perform();
        order.click();
    }
}
