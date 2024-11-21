package Script;

import Page.AdminPage;
import Page.DashboardPage;
import Page.LoginPage;

public class Step {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();
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
    public void fillAddAdminForm(){
        adminPage.clickAddAdminButton();
        adminPage.selectUserRoleAdmin();
        adminPage.inputEmployeeName();
        adminPage.selectStatusEnabled();
        adminPage.inputUsername();
        adminPage.inputPassword();
        adminPage.inputConfirmPassword();


    }
}
