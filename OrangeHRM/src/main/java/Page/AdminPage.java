package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminPage extends BasePage {
    private final String headerTitle = "Admin";
    private final String addUserTitle = "Add User";
    private final String employeeName = "Dang Hai Binh";
    private final String username = "Dang Hai Binh";
    private final String password = "Amaris!123";

    private final By locatorHeaderTitle = By.cssSelector("div[id='app'] >div > div > header > div > div > span > h6:nth-child(1)");


    private final By adminButton = By.cssSelector("div[id='app'] > div > div > aside > nav > div:nth-child(2) > ul > li:nth-child(1) > a");
    private final By addAdminButton = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div > button ");

    private final By locatorAddUserTitle = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > h6");
    private final By userRoleDropdown = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div > div > div:nth-child(2) > div >div > div > i");
    private final By userRoleAdmin = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2)");

    private final By employeeNameBlock =By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input");

    private final By statusDropdown = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(3) > div > div:nth-child(2) > div ");
    private final By statusEnabled = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(3) > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2)");
    private final By usernameBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(4) > div > div:nth-child(2) > input");
    private final By passwordBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div:nth-child(2) > div > div > div > div:nth-child(2) > input:nth-child(1)");
    private final By confirmPasswordBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(2) > input");

    private final By saveButton = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > button:nth-child(3)");
    public void goToAdminPage(){
        click(adminButton);
        Assert.assertEquals(getText(locatorHeaderTitle),headerTitle);
    }
    public void clickAddAdminButton(){
        click(addAdminButton);
        Assert.assertEquals(getText(locatorAddUserTitle), addUserTitle);
    }
    public void selectUserRoleAdmin(){
        click(userRoleDropdown);
        click(userRoleAdmin);
    }
    public void inputEmployeeName(){
        enterText(employeeNameBlock,employeeName);

    }
    public void selectStatusEnabled(){
        click(statusDropdown);
        click(statusEnabled);

    }
    public void inputUsername(){
        enterText(usernameBlock,username);

    }
    public void inputPassword(){
        enterText(passwordBlock,password);

    }
    public void inputConfirmPassword(){
        enterText(passwordBlock,password);

    }
    public

}
