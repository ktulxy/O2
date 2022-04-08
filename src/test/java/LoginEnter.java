import Driver.BrowseDriver;
import Page.Login;
import Page.Menu;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static Page.Login.checkLogin;



public class LoginEnter  extends BrowseDriver {


    @Test(priority = 1)
    public static void testLogin() {
        driver.get("https://ais2test.ingo.ua/webcenter/system/login.jsp");
        Login lg = new Login();
        lg.initialize("omudritsky", "123666456");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(checkLogin(),"ОФОРМЛЕННЯ ДОГОВОРУ МОЖЛИВЕ ЛИШЕ ДЛЯ ФІЗИЧНИХ ОСІБ - СТРАХУВАЛЬНИКІВ");

    }
}
