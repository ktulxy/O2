package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BrowseDriver {

   public static WebDriver driver;

    @BeforeSuite
    public void invokeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\operadriver.exe");
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void close(){
        //driver.close();
    }


}
