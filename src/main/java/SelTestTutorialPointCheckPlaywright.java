import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.microsoft.playwright.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SelTestTutorialPointCheckPlaywright {

    private Playwright playwright;
    private Browser browser;
    private Page page;

    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @AfterEach
    public void tearDown() {
        browser.close();
        playwright.close();
    }

    @Test
    public void checkboxTest() {
        // Přechod na stránku
        page.navigate("https://www.tutorialspoint.com/selenium/practice/check-box.php");

        // Klik na plus (stejný XPath jako v Selenium)
        page.click("//*[@id=\"bs_1\"]/span[1]");

        // Kliknutí na checkboxy
        page.click("#c_bf_1");
        page.click("#c_bf_2");

        // Kontrola zaškrtnutí nadřazeného prvku
        assertTrue(page.isChecked("#c_bs_1"));

        // Znova klik na c_bf_1
        page.click("#c_bf_1");

        // Kontrola odškrtnutí nadřazeného prvku
        assertFalse(page.isChecked("#c_bs_1"));
    }

}
