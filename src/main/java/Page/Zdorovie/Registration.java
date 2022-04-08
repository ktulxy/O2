package Page.Zdorovie;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import static Driver.BrowseDriver.driver;

public class Registration {

    // Data of insurer
    public static WebElement ipn = driver.findElement(By.xpath("//section[3]/div/div/div/div/div[2]/div/div/div/input"));
    public static WebElement secondName = driver.findElement(By.xpath("//section[3]/div/div/div/div/div[2]/div/div[2]/div/input"));
    public static WebElement firstName = driver.findElement(By.xpath("//section[3]/div/div/div/div/div[2]/div/div[3]/div/input"));
    public static WebElement fathersName = driver.findElement(By.xpath("//div[2]/div/div/input"));
    public static WebElement birthDay = driver.findElement(By.xpath("//div[3]/div[3]/div/input"));
    public static WebElement insuredIsInsured = driver.findElement(By.xpath("//div[4]/div/div/label/div/span/span"));
    //  Document
    public static WebElement nameDocument = driver.findElement(By.xpath("//div[6]/div/div/div/button/div/div/div"));
    public static WebElement nameDocumentSearch = driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input"));
    public static WebElement seriaDocument = driver.findElement(By.xpath("//div[6]/div[2]/div/input"));
    public static WebElement nomberDocument = driver.findElement(By.xpath("//div[6]/div[3]/div/input"));
    public static WebElement whoGiveDocument = driver.findElement(By.xpath("//div[7]/div/div/input"));
    public static WebElement dateDocument = driver.findElement(By.xpath("//div[7]/div[2]/div/input"));
    public static WebElement dateEndDocument = driver.findElement(By.xpath("//div[7]/div[3]/div/input"));
    //  Contacts
    public static WebElement tel = driver.findElement(By.xpath("//div[10]/div/div/input"));
    public static WebElement mail = driver.findElement(By.xpath("//div[10]/div[2]/div/input"));
    //  Address living
    public static WebElement oblast = driver.findElement(By.xpath("//div[12]/div/div/div/button/div/div/div"));
    public static WebElement oblastSearch = driver.findElement(By.xpath("//div[12]/div/div/div/div/div/input"));
    public static WebElement city = driver.findElement(By.xpath("//div[12]/div[2]/div/div/button/div/div/div"));
    public static WebElement citySearch = driver.findElement(By.xpath("//div[12]/div[2]/div/div/div/div/input"));
    public static WebElement street = driver.findElement(By.xpath("//div[13]/div/div/div/button/div/div/div"));
    public static WebElement streetSearch = driver.findElement(By.xpath("//div[13]/div/div/div/div/div/input"));
    public static WebElement house = driver.findElement(By.xpath("//div[13]/div[3]/div/div"));
    public static WebElement houseSearch = driver.findElement(By.xpath("//div[13]/div[3]/div/div/div/div/input"));
    public static WebElement flat = driver.findElement(By.xpath("//div[14]/div[2]/div/input"));
    // Make police
    public static WebElement makePolis = driver.findElement(By.xpath("//section[5]/div/div/div/input"));


public static void detailsOfInsurer() throws InterruptedException {
    ipn.sendKeys("3334446660");
    secondName.sendKeys("Конь");
    firstName.sendKeys("Тест");
    fathersName.sendKeys("Олегович");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    birthDay.click();
    birthDay.sendKeys("15.06.1986" + Keys.ENTER);
    Thread.sleep(2000);
    insuredIsInsured.click();
    nameDocument.click();
    nameDocumentSearch.sendKeys("Паспорт громадянина України (у формі книжечки)", Keys.ENTER, Keys.ESCAPE);
    //seriaDocument.sendKeys("ME");
    nomberDocument.sendKeys("111111");
    //whoGiveDocument.sendKeys("Киевский");
    dateDocument.click();
    dateDocument.sendKeys("01.01.2000", Keys.ENTER);
    dateEndDocument.click();
    dateEndDocument.sendKeys("01.01.2030", Keys.ENTER);
    tel.sendKeys("0916626688");
    //mail.sendKeys("ooo@o.ua");
    oblast.click();
    oblastSearch.sendKeys("КИЇВСЬКА ОБЛАСТЬ", Keys.ENTER, Keys.ESCAPE);
    city.click();
    Thread.sleep(2000);
    citySearch.sendKeys("Київ", Keys.ENTER, Keys.ESCAPE);
    street.click();
    Thread.sleep(2000);
    streetSearch.sendKeys("майдан Незалежності", Keys.ENTER,Keys.ESCAPE);
    house.click();
    Thread.sleep(2000);
    houseSearch.sendKeys("2", Keys.ENTER, Keys.ESCAPE);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    makePolis.click();
    }
}
