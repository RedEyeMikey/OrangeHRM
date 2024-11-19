package Test;

import Base.BaseTest;
import Page.DashboardPage;
import Page.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashBoardPage = new DashboardPage();
    @BeforeMethod
    public void loadWebsite() {
        basePage.getUrl(loginPage.url);
    }
    @Test (priority = 1)
    public void loginToPageSuccessful() {
        loginPage.inputCorrectUsername();
        loginPage.inputCorrectPassword();
        loginPage.clickLoginButton();
        dashBoardPage.checkLoginSuccessful();
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
    @Test
    public void loginAndLogout(){
        loginPage.inputCorrectUsername();
        loginPage.inputCorrectPassword();
        loginPage.clickLoginButton();
        dashBoardPage.checkLoginSuccessful();
        dashBoardPage.clickUserDropdown();
        dashBoardPage.clickLogoutButton();
        dashBoardPage.checkLogoutSuccessful();

    }
}

