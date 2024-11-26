package Script;

import Page.AdminPage;
import Page.DashboardPage;
import Page.LoginPage;
import Page.PIMPage;

public class Step {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    AdminPage adminPage = new AdminPage();
    PIMPage pimPage = new PIMPage();
    public void loginDefaultAccount(){
        loginPage.inputDefaultUsername();
        loginPage.inputDefaultPassword();
        loginPage.clickLoginButton();
        dashboardPage.checkLoginSuccessful();

    }
    public void logout(){
        dashboardPage.clickUserDropdown();
        dashboardPage.clickLogoutButton();
        dashboardPage.checkLogoutSuccessful();
    }

    public void registerNewEmployee(){
        dashboardPage.goToPIM();
        pimPage.clickAddEmployeeButton();
        pimPage.inputFirstName();
        pimPage.inputMiddleName();
        pimPage.inputLastName();
        pimPage.inputId();
        pimPage.clickSaveButton();
        pimPage.checkSaveSuccessfulMessage();
        pimPage.waitForServerSaveAccount();
    }
    public void registerNewAdminAccount(){
        dashboardPage.goToAdminPage();
        adminPage.clickAddAdminButton();
        adminPage.selectUserRoleAdmin();
        adminPage.inputEmployeeName();
        adminPage.selectFullName();
        adminPage.selectStatusEnabled();
        adminPage.inputUsername();
        adminPage.inputPassword();
        adminPage.inputConfirmPassword();
        adminPage.clickSaveButton();
        adminPage.checkSaveSuccessfulMessage();
        dashboardPage.waitForServerSaveAdminAccount();
    }
    public void gotoDashboardPage(){
        dashboardPage.goToDashBoard();
    }
    public void loginNewAccount(){
        loginPage.inputNewUsername();
        loginPage.inputNewPassword();
        loginPage.clickLoginButton();
        dashboardPage.checkLoginSuccessful();
        dashboardPage.checkNewUsername();

    }

}
