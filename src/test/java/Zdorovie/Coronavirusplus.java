package Zdorovie;

import Driver.BrowseDriver;
import Page.Login;
import Page.Zdorovie.Corona;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static Page.Menu.Healthy;
import static Page.Registration.detailsOfInsurer;
import static Page.Zdorovie.Corona.*;
import static Page.Zdorovie.Corona.Coronavirus.choice;



public class Coronavirusplus extends BrowseDriver {

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
    public void data() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Corona.coronaData("15.06.1986", "40000");
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(order);
        actions.perform();
        order.click();
        Assert.assertEquals(isDogovor(),"Параметри договору");
    }

    @Test(priority = 3)
    public void registration() throws InterruptedException {
        detailsOfInsurer();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(confirmation(),"Для підписання договору відправте СМС-код на номер телефону страхувальника");
    }
}
