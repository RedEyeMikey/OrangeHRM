package Base;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        basePage = new BasePage();
        loginPage = new LoginPage();

    }
    @BeforeMethod
    public void loadWebsite() {
        basePage.getUrl(loginPage.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
