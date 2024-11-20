package Script;

import Page.DashboardPage;
import Page.LoginPage;

public class Step {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    public void Login(){
        loginPage.inputCorrectUsername();
        loginPage.inputCorrectPassword();
        loginPage.clickLoginButton();
        dashboardPage.checkLoginSuccessful();

    }
    public void Logout(){
        dashboardPage.clickUserDropdown();
        dashboardPage.clickLogoutButton();
        dashboardPage.checkLogoutSuccessful();
    }
}
