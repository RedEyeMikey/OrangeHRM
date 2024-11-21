package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

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
    public final By username = By.cssSelector("div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input[name='username']");
    public final By password = By.cssSelector("div[class='orangehrm-login-form'] > form > div:nth-child(3) > div > div:nth-child(2) > input");
    public final By loginButton = By.cssSelector("div[class='orangehrm-login-form'] > form > div:nth-child(4) > button");
    public final By noInputUsername = By.cssSelector("div[class='orangehrm-login-form'] > form > div > div > span");
    public final By noInputPassword = By.cssSelector("div[class='orangehrm-login-form'] > form > div:nth-child(3) > div >span");
    public final By invalidUsernameOrPassword = By.cssSelector("div[class='orangehrm-login-form'] > div > div > div >p");

    public final String correctUsername = "Admin";
    public final String correctPassword = "admin123";
    public final String incorrectUsername = "aaaaaa";
    public final String incorrectPassword = "aaaaaa";
    public final String noUsernameOrPasswordMessage = "Required";
    public final String invalidAccountMessage = "Invalid credentials";
    
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
