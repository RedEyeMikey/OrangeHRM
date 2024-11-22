package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminPage extends BasePage {
    private final String addUserTitle = "Add User";
    private final String employeeNameHint = "Dang";
    public final String username = "Dang Hai Binh";
    public final String password = "Amaris!123";
    private final String saveSuccessfulMessage = "Successfully Saved";


    private final By addAdminButton = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div > button ");

    private final By locatorAddUserTitle = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > h6");
    private final By userRoleDropdown = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div > div > div:nth-child(2) > div >div > div > i");
    private final By userRoleAdmin = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2)");

    private final By employeeNameBlock =By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div > input");
    private final By selectName =By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form  > div > div > div:nth-child(2) > div > div:nth-child(2)> div >div:nth-child(2) > div");

    private final By statusDropdown = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(3) > div > div:nth-child(2) > div ");
    private final By statusEnabled = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(3) > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2)");
    private final By usernameBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > div > div:nth-child(4) > div > div:nth-child(2) > input");
    private final By passwordBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div:nth-child(2) > div > div > div > div:nth-child(2) > input:nth-child(1)");
    private final By confirmPasswordBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(2) > input");

    private final By saveButton = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div > button:nth-child(3)");

    private final By saveSuccessfulNotification = By.cssSelector("div[id='app'] > div:nth-child(2) > div > div > div:nth-child(2) > p:nth-child(2)");


    public void clickAddAdminButton(){
        click(addAdminButton);
        Assert.assertEquals(getText(locatorAddUserTitle), addUserTitle);
    }
    public void selectUserRoleAdmin(){
        click(userRoleDropdown);
        click(userRoleAdmin);
    }
    public void inputEmployeeName(){
        enterText(employeeNameBlock, employeeNameHint);
    }
    public void selectFullName(){
        click(employeeNameBlock);
        click(selectName);
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
        enterText(confirmPasswordBlock,password);

    }
    public void clickSaveButton(){
        click(saveButton);
    }
    public void checkSaveSuccessfulMessage(){
        Assert.assertEquals(getText(saveSuccessfulNotification), saveSuccessfulMessage);
    }


}
