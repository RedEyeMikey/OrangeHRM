package Test;

import Base.BaseTest;
import Page.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void loadWebsite(){
        basePage.getUrl(loginPage.url);
    }
    @Test
    public void loginToPageSuccessful(){
        loginPage.inputCorrectPassword();
        loginPage.inputCorrectUsername();
        loginPage.clickLoginButton();
        loginPage.checkLoginSuccessful();
    }
    @Test
    public void loginFailedNoUsernameInput(){
        loginPage.inputCorrectPassword();
        loginPage.checkLoginFailedNoUsername();
    }
}

