import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.jupiter.api.Assertions.*;


public class SelTestTutorialPointCheck {

    private WebDriver ovladac;

    @BeforeEach
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanss\\Desktop\\Software Development Academy\\Kody\\SeleniumSkillmea2\\src\\main\\resources\\chromedriver.exe");
        //ovladac = new ChromeDriver();

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\hanss\\Desktop\\Software Development Academy\\Kody\\BddZ4089\\src\\main\\resources\\geckodriver.exe");
        //ovladac = new FirefoxDriver();

        WebDriverManager.chromedriver().setup();
        ovladac = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        ovladac.quit();
    }

    @Test
    public void checkboxTest() {

        //Prepnuti na stranku
        ovladac.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        //Nalezeni plus elementu
        ovladac.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();
        //Kliknuti na checkboxy
        ovladac.findElement(By.id("c_bf_1")).click();
        ovladac.findElement(By.id("c_bf_2")).click();
        //Kontrola zaskrtnuti nadrazeneho prvku
        assertTrue(ovladac.findElement(By.id("c_bs_1")).isSelected());
        ovladac.findElement(By.id("c_bf_1")).click();
        //Kontrola odskrtnuti nadrazeneho prvku
        assertFalse(ovladac.findElement(By.id("c_bs_1")).isSelected());
    }

}
