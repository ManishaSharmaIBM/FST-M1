import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CRM_Activity_2 {
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


        List<WebElement>links=driver.findElements(By.tagName("img"));

        // this will display list of all images exist on page
        for(WebElement ele:links){
            System.out.println("Header image URL is: "+ ele.getAttribute("src"));}

    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
