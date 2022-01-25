package Page;

import Driver.BrowseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Menu extends BrowseDriver {

    public static WebElement Healthy = driver.findElement(By.xpath("//a[4]/span"));
    public static WebElement Maino = driver.findElement(By.xpath("//a[3]/span"));
    public static WebElement Travel = driver.findElement(By.xpath("//a[2]/span"));
    public static WebElement Avto = driver.findElement(By.xpath("//a/span"));


    public void menuCheck(){

    }
}


