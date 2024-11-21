package Test;

import Base.BaseTest;
import Script.Step;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class LoginTest extends BaseTest {
    Step step = new Step();

    @BeforeMethod
    public void loadWebsite() {
        basePage.getUrl(loginPage.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void testCase01(){
        step.Login();
        step.Logout();
    }

}

