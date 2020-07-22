import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void doLogin() {
        driver.get("https://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("trainer@wey2automation.com");
        //comment jenkins
    }

    @AfterSuite
    public void tearLogin() {
        driver.quit();
    }
}
