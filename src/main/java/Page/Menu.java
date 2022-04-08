package Page;

import Driver.BrowseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Menu extends BrowseDriver {

    public static WebElement Healthy = driver.findElement(By.xpath("//a[4]/span"));
    public static WebElement House = driver.findElement(By.xpath("//a[3]/span"));
    public static WebElement Travel = driver.findElement(By.xpath("//a[2]/span"));
    public static WebElement Auto = driver.findElement(By.xpath("//a/span"));


    public static String healthyCheck(){
        String healthyCheck = Healthy.getText();
        return healthyCheck;
    }
    public static String houseCheck(){
        String houseCheck = House.getText();
        return  houseCheck;
    }
    public static String travelCheck(){
        String travelCheck = Travel.getText();
        return  travelCheck;
    }
    public static String autoCheck(){
        String autoCheck = Auto.getText();
        return  autoCheck;
    }

}


