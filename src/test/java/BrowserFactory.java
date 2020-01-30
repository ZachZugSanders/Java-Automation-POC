import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    private static BrowserFactory instance = new BrowserFactory();

    // for completion not used...
    private static String browserType = null;

    private ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>() {

        @Override
        protected WebDriver initialValue(){
            System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
            return new FirefoxDriver();
        }
    };

    private BrowserFactory(){}

    public static BrowserFactory getInstance(){
        return instance;
    }

    public WebDriver getDriver(){
        return threadLocal.get();
    }

    public void removeDriver(){
        threadLocal.get().quit();
        threadLocal.remove();
    }
}
