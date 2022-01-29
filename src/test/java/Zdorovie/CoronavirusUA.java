package Zdorovie;

import Driver.BrowseDriver;
import Page.Login;
import Page.Zdorovie.Corona;
import org.testng.annotations.Test;
import java.time.Duration;
import static Page.Menu.Healthy;
import static Page.Zdorovie.Corona.Coronavirus.coronaСhoice;


public class CoronavirusUA extends BrowseDriver {

    @Test(priority = 1)
    public void Healthy(){
        driver.get("https://ais2test.ingo.ua/webcenter/system/login.jsp");
        Login lg = new Login();
        lg.initialize("omudritsky","123666456");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Healthy.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        coronaСhoice.click();
    }

    @Test(priority = 2)
    public void data(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Corona.coronaData("01.01.2000");

    }
}
