import Driver.BrowseDriver;
import Page.Login;
import Page.Menu;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static Page.Menu.*;


public class LoginEnter  extends BrowseDriver {


    @Test(priority = 1)
    public void testLogin(){
         BrowseDriver.driver.get("https://ais2test.ingo.ua/webcenter/system/login.jsp");
         Login lg = new Login();
         lg.initialize("omudritsky","123666456");

     //   Assert.assertEquals(check,"ОФОРМЛЕННЯ ДОГОВОРУ МОЖЛИВЕ ЛИШЕ ДЛЯ ФІЗИЧНИХ ОСІБ - СТРАХУВАЛЬНИКІВ");

    }
    @Test(priority = 5)
    public void zdorovie(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Menu menu = new Menu();
        menu.menuCheck();
        Healthy.click();
       // Assert.assertEquals(Check,"КОРОНОЗАХИСТ+");

    }
    @Test(priority = 3)
    public void maino(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Menu menu = new Menu();
        menu.menuCheck();
        Maino.click();
        // Assert.assertEquals(Check,"КВАРТИРА ЕКСПРЕС");

    }
    @Test(priority = 4)
    public void travel(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Menu menu = new Menu();
        menu.menuCheck();
        Travel.click();
        // Assert.assertEquals(Check,"ТУРИЗМ");

    }
    @Test(priority = 2)
    public void avto(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Menu menu = new Menu();
        menu.menuCheck();
        Avto.click();
        // Assert.assertEquals(Check,"Е-АВТОЦИВІЛКА");

    }
}
