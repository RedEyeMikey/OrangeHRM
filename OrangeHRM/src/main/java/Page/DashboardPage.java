package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardPage extends BasePage {
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();

    public final String dashboardHeaderTitle = "Dashboard";
    private final String adminHeaderTitle = "Admin";
    private final String pimHeaderTitle = "PIM";

    private final By locatorHeaderTitle = By.cssSelector("div[id='app'] > div >div > header > div > div > span > h6");
    private final By usernameTitle = By.cssSelector("div[id = 'app'] > div > div > header > div > div:nth-child(3) > ul > li > span > p");

    public final By userDropdown = By.cssSelector("div[id = 'app'] > div > div > header > div > div:nth-child(3) > ul > li > span");
    public final By logoutButton = By.cssSelector("div[id = 'app'] > div > div > header > div > div:nth-child(3) > ul > li  >ul > li:nth-child(4)");
    public final By elementHeaderTitle = By.cssSelector("div[id='app'] >div > div > header > div > div > span > h6");

    private final By dashboardButton = By.cssSelector("div[id='app'] > div > div > aside > nav > div:nth-child(2) > ul > li:nth-child(8) > a");
    private final By adminButton = By.cssSelector("div[id='app'] > div > div > aside > nav > div:nth-child(2) > ul > li:nth-child(1) > a");
    private final By pimButton = By.cssSelector("div[id='app'] > div >div > aside > nav > div:nth-child(2) > ul > li:nth-child(2) > a");


    public String getDashboardHeaderTitle(){
        return getText(elementHeaderTitle);
    }

    public void clickUserDropdown(){
        click(userDropdown);
    }
    public void clickLogoutButton(){
        click(logoutButton);
    }

    public void checkLoginSuccessful(){
        Assert.assertEquals(getDashboardHeaderTitle(), dashboardHeaderTitle);
    }
    public void checkLogoutSuccessful(){
        Assert.assertTrue(isDisplayed(loginPage.loginButton));
    }
    public void goToAdminPage(){
        click(adminButton);
        Assert.assertEquals(getText(locatorHeaderTitle), adminHeaderTitle);
    }
    public void goToPIM(){
        click(pimButton);
        Assert.assertEquals(getText(locatorHeaderTitle), pimHeaderTitle);
    }
    public void goToDashBoard(){
        click(dashboardButton);
        checkLoginSuccessful();
    }
    public void checkNewUsername(){
        Assert.assertEquals(getText(usernameTitle),adminPage.username);
    }
    public void waitForServerSaveAdminAccount(){
        waitForVisibility(locatorHeaderTitle);
    }
}
