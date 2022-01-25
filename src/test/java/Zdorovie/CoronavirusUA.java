package Zdorovie;

import Driver.BrowseDriver;
import Page.Login;
import Page.Menu;
import Page.Zdorovie.Corona;
import org.testng.annotations.Test;

import java.time.Duration;

import static Page.Menu.Healthy;

import static Page.Zdorovie.Corona.Coronavirus.corona;



public class CoronavirusUA extends BrowseDriver {

    @Test(priority = 1)
    public void Healthy(){
        driver.get("https://ais2test.ingo.ua/webcenter/system/login.jsp");
        Login lg = new Login();
        lg.initialize("omudritsky","123666456");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Healthy.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        corona.click();
    }

    @Test(priority = 2)
    public void data(){
        Corona corona = new Corona();
        corona.coronaData("01.01.2000");

    }
}
