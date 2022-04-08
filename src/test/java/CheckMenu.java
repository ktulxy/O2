import Driver.BrowseDriver;
import Page.Menu;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static Page.Menu.*;


public class CheckMenu extends BrowseDriver {

    @Test(priority = 1)
    public void Health(){
        LoginEnter.testLogin();
        Healthy.click();
        Menu.healthyCheck();
        Assert.assertEquals(healthyCheck(),"Здоров'я");

    }
    @Test(priority = 2)
    public void House(){
        House.click();
        Menu.houseCheck();
        Assert.assertEquals(houseCheck(),"Майно");

    }
    @Test(priority = 3)
    public void Travel(){
        Travel.click();
        Menu.travelCheck();
        Assert.assertEquals(travelCheck(),"Подорожі");

    }
    @Test(priority = 4)
    public void Auto(){
        Auto.click();
        Menu.autoCheck();
        Assert.assertEquals(autoCheck(),"Авто");

    }
}
