package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='username']")
//    private WebElement username;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='password']")
//    private WebElement password;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div:nth-child(4) > button")
//    private WebElement loginButton;
//    @FindBy(css = "div[id='app'] >div > div > header > div > div > span > h6")
//    private WebElement elementHeaderTitle;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > span")
//    private WebElement noInputUsername;
//    @FindBy(css = "div[class='orangehrm-login-form'] > form > div:nth-child(3) > div >span")
//    private WebElement noInputPassword;
//    @FindBy(css = "div[class='orangehrm-login-form'] > div > div > div >p")
//    private WebElement invalidUsernameOrPassword;
    private final By username = By.cssSelector("div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='username']");
    private final By password = By.cssSelector("div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='password']");
    private final By loginButton = By.cssSelector("div[class='orangehrm-login-form'] > form > div:nth-child(4) > button");
    private final By noInputUsername = By.cssSelector("div[class='orangehrm-login-form'] > form > div > div > span");
    private final By noInputPassword = By.cssSelector("div[class='orangehrm-login-form'] > form > div:nth-child(3) > div >span");
    private final By invalidUsernameOrPassword = By.cssSelector("div[class='orangehrm-login-form'] > div > div > div >p");

    private final String correctUsername = "Admin";
    private final String correctPassword = "admin123";
    private final String incorrectUsername = "aaaaaa";
    private final String incorrectPassword = "aaaaaa";
    private final String noUsernameOrPasswordMessage = "Required";
    private final String invalidAccountMessage = "Invalid credentials";
    
    public final String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";


    public void inputCorrectUsername(){
        enterText(username,correctUsername);
    }
    public void inputCorrectPassword(){
        enterText(password, correctPassword);
    }
    public void inputIncorrectUsername(){
        enterText(username, incorrectUsername);
    }
    public void inputIncorrectPassword(){
        enterText(password, incorrectPassword);
    }
    public void clickLoginButton(){
        click(loginButton);
    }
    public void checkLoginFailedNoUsername(){
        Assert.assertEquals(getText(noInputUsername),noUsernameOrPasswordMessage);
    }
    public void checkLoginFailedNoPassword(){
        Assert.assertEquals(getText(noInputPassword),noUsernameOrPasswordMessage);
    }
    public void checkLoginFailedNoUsernameAndPassword(){
        Assert.assertEquals(getText(noInputUsername),noUsernameOrPasswordMessage);
        Assert.assertEquals(getText(noInputPassword),noUsernameOrPasswordMessage);
    }
    public void checkLoginFailedInvalidAccount(){
        Assert.assertEquals(getText(invalidUsernameOrPassword),invalidAccountMessage);
    }
}
