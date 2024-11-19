package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardPage extends BasePage {
    LoginPage loginPage = new LoginPage();

    public final String headerTitle = "Dashboard";

    public final By userDropdown = By.cssSelector("div[id = 'app'] > div > div > header > div > div:nth-child(3) > ul > li > span");
    public final By logoutButton = By.cssSelector("div[id = 'app'] > div > div > header > div > div:nth-child(3) > ul > li  >ul > li:nth-child(4)");
    public final By elementHeaderTitle = By.cssSelector("div[id='app'] >div > div > header > div > div > span > h6");

    public String getHeaderTitle(){
        return getText(elementHeaderTitle);
    }

    public void clickUserDropdown(){
        click(userDropdown);
    }
    public void clickLogoutButton(){
        click(logoutButton);
    }

    public void checkLoginSuccessful(){
        Assert.assertEquals(getHeaderTitle(),headerTitle);
    }
    public void checkLogoutSuccessful(){
        Assert.assertTrue(isDisplayed(loginPage.loginButton));

    }
}
