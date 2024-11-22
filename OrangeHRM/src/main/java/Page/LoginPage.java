package Page;

import Base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    AdminPage adminPage = new AdminPage();

//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='username']")
//    public WebElement username;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='password']")
//    public WebElement password;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div:nth-child(4) > button")
//    public WebElement loginButton;
//    @FindBy(css = "div[id='app'] >div > div > header > div > div > span > h6")
//    public WebElement elementHeaderTitle;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > span")
//    public WebElement noInputUsername;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div:nth-child(3) > div >span")
//    public WebElement noInputPassword;
//    @FindBy(css = "div[class='orangehrm-login-form'] > div > div > div >p")
//    public WebElement invalidUsernameOrPassword;
    public final By usernameBlock = By.cssSelector("div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='username']");
    public final By passwordBlock = By.cssSelector("div[class='orangehrm-login-form'] > form > div:nth-child(3) > div > div:nth-child(2) > input");
    public final By loginButton = By.cssSelector("div[class='orangehrm-login-form'] > form > div:nth-child(4) > button");

    public final String defaultUsername = "Admin";
    public final String defaultPassword = "admin123";

    public final String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    public void inputDefaultUsername(){
        enterText(usernameBlock, defaultUsername);
    }
    public void inputDefaultPassword(){
        enterText(passwordBlock, defaultPassword);
    }

    public void inputNewUsername(){
        enterText(usernameBlock,adminPage.username);
    }
    public void inputNewPassword(){
        enterText(usernameBlock, adminPage.password);
    }
    public void clickLoginButton() {
        click(loginButton);
    }
}
