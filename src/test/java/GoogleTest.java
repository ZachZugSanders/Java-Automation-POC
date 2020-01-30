import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.components.SearchPage;

public class GoogleTest extends BaseTest {

    @Test
    public void verifyGoogleSearchLogo() {
        SearchPage searchPage = PageFactory.initElements(
                BrowserFactory.getInstance().getDriver(), SearchPage.class
        );

        Assert.assertTrue(searchPage.isLogoDisplayed());
    }

    @Test
    public void inputSeachGoogle() {
        SearchPage searchPage = PageFactory.initElements(
                BrowserFactory.getInstance().getDriver(), SearchPage.class
        );
        searchPage.isInputBoxDisplayed("Qa Engineering Jobs");
    }
}
