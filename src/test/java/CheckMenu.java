import Driver.BrowseDriver;
import Page.Menu;
import org.testng.annotations.Test;

import java.time.Duration;

import static Page.Menu.*;
import static Page.Menu.Avto;

public class CheckMenu extends BrowseDriver {

    @Test(priority = 1)
    public void zdorovie(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        LoginEnter.testLogin();
        Menu menu = new Menu();
        menu.menuCheck();
        Healthy.click();
        // Assert.assertEquals(Check,"КОРОНОЗАХИСТ+");

    }
    @Test(priority = 2)
    public void maino(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Menu menu = new Menu();
        menu.menuCheck();
        Maino.click();
        // Assert.assertEquals(Check,"КВАРТИРА ЕКСПРЕС");

    }
    @Test(priority = 3)
    public void travel(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Menu menu = new Menu();
        menu.menuCheck();
        Travel.click();
        // Assert.assertEquals(Check,"ТУРИЗМ");

    }
    @Test(priority = 4)
    public void avto(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Menu menu = new Menu();
        menu.menuCheck();
        Avto.click();
        // Assert.assertEquals(Check,"Е-АВТОЦИВІЛКА");

    }
}
