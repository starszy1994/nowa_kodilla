package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {


    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;

    private GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {

        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();

    }
    public GoogleResults loadResults(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        return new GoogleResults(webDriver);
    }
}