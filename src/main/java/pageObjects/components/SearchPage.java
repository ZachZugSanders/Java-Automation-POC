package pageObjects.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    @FindBy(id = "hplogo")
    private WebElement imgGoogleLogo;
    @FindBy(name = "q")
    private WebElement inputGoogleSearch;
    @FindBy(name = "btnK")
    private WebElement btnSearch;

    public boolean isLogoDisplayed(){
        return imgGoogleLogo.isDisplayed();
    }


    public void isInputBoxDisplayed(String searchText){
        imgGoogleLogo.isDisplayed();
        inputGoogleSearch.sendKeys(searchText);
        btnSearch.click();
    }
}
