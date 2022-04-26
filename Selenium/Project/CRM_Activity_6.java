import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CRM_Activity_6 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void exampleTestCase() {


        //Find username and password fields
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"username_password\"]"));
        //Type credentials
        userName.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        //Click Log in
        driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();

        driver.findElement(By.cssSelector(".navbar > div:nth-child(1)"));

        WebElement ActivitiesMenu = driver.findElement(By.xpath("//*[@id=\"grouptab_3\"]"));
        driver.findElement(By.cssSelector("#grouptab_3")).click();
        System.out.println("The Activities menu is displayed: " + ActivitiesMenu.isDisplayed());






    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
