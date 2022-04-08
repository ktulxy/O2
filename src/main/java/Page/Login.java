package Page;

import Driver.BrowseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BrowseDriver{


    WebElement logInput = driver.findElement(By.xpath("//input[@id='username']"));
    WebElement passInput = driver.findElement(By.xpath("//input[@id='password']"));
    WebElement enter = driver.findElement(By.xpath("//div[@id='T:oc_5595056972rFJw4r1:loginFm:submitLogin']/a/span"));


    public void initialize(String login, String password) {

        logInput.sendKeys(login);
        passInput.sendKeys(password);
        enter.click();
    }

    public static String checkLogin(){
        WebElement loginCheck = driver.findElement(By.xpath("//h2[contains(.,'ОФОРМЛЕННЯ ДОГОВОРУ МОЖЛИВЕ ЛИШЕ ДЛЯ ФІЗИЧНИХ ОСІБ - СТРАХУВАЛЬНИКІВ')]"));
        String logCheck = loginCheck.getText();
        return logCheck;
    }

}







