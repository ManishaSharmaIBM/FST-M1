import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CRM_Activity_7 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void exampleTestCase() throws InterruptedException {


        //Find username and password fields
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"username_password\"]"));
        //Type credentials
        userName.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        //Click Log in
        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Leads\"]")).click();

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")));
        //Click the button to open a simple alert
        driver.findElement(By.cssSelector("#adspan_6af2edb0-bc40-46d1-7837-5fdc647a1061 > span:nth-child(1)")).click();
        WebElement amey = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ui-id-8 > div:nth-child(1)")));
        //Switch to alert window
        Alert simpleAlert = driver.switchTo().alert();

        //Get text in the alert box and print it
        String alertText = simpleAlert.getText();
        System.out.println("Pop up text is: " + alertText);

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
