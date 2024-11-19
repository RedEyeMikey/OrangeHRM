package Test;

import Base.BaseTest;
import Page.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void loadWebsite() {
        basePage.getUrl(loginPage.url);
    }
    @Test (priority = 1)
    public void loginToPageSuccessful() {
        loginPage.inputCorrectUsername();
        loginPage.inputCorrectPassword();
        loginPage.clickLoginButton();
        loginPage.checkLoginSuccessful();
    }
    @Test
    public void loginFailedNoUsernameInput(){
        loginPage.inputCorrectPassword();
        loginPage.clickLoginButton();
        loginPage.checkLoginFailedNoUsername();
    }
    @Test
    public void loginFailedNoPasswordInput(){
        loginPage.inputCorrectUsername();
        loginPage.clickLoginButton();
        loginPage.checkLoginFailedNoPassword();
    }
    @Test
    public void loginFailedInvalidAccount(){
        loginPage.inputIncorrectUsername();
        loginPage.inputIncorrectPassword();
        loginPage.clickLoginButton();
        loginPage.checkLoginFailedInvalidAccount();
    }
    @Test
    public void noInputUsernameAndPassword(){
        loginPage.clickLoginButton();
        loginPage.checkLoginFailedNoUsernameAndPassword();
    }
}

