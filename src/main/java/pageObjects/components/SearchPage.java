package pageObjects.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    @FindBy(id = "hplogo")
    private WebElement imgGoogleLogo;

    public boolean isLogoDisplayed(){
        return imgGoogleLogo.isDisplayed();
    }
}
