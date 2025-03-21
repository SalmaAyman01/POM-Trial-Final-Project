package TestCasesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//common class
public class BaseTest {

   protected WebDriver driver;

    @BeforeSuite
    public void beforeClass(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.demoblaze.com/");

    }

    @AfterSuite
    public void afterClass(){
        if (driver != null) {
            driver.quit();
        }
    }
}
