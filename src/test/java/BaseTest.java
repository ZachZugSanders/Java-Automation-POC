import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod(alwaysRun = true)
    public void testSetup(){
        WebDriver driver = BrowserFactory.getInstance().getDriver();

        driver.get("https://www.google.com");
        System.out.println("test init...");
    }

    @AfterMethod(alwaysRun = true)
    public void testAway(){
        BrowserFactory.getInstance().removeDriver();
    }
}
