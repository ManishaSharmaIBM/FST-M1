import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
public class CRM_Activity_3 {

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
        WebElement firstcopyrighttext = driver.findElement(By.xpath("//*[@id=\"admin_options\"]"));

        //Print the title of the page
        System.out.println("first copyright text is: " + firstcopyrighttext.getText());


    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
