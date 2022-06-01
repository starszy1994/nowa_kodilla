import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.ResultRandomPage;

import static org.junit.Assert.assertSame;

public class TestGoogle {

    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.switchTo().frame(0);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void testRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        WebElement webElement = googleResults.randomResult();
        ResultRandomPage resultRandomPage = new ResultRandomPage(driver);

        WebElement webElement1 = resultRandomPage.clickInRandomPage(webElement);

        assertSame(webElement, webElement1);
    }
}