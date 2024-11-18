package Page;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    BasePage basePage = new BasePage();


    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input:nth-child(1)")
    private WebElement username;
    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > div:nth-child(2) > input:nth-child(2)")
    private WebElement password;
    @FindBy(css = "div[class='orangehrm-login-form'] > form > div:nth-child(4) > button")
    private WebElement loginButton;
    @FindBy(css = "div[id='app'] >div > div > header > div > div > span > h6")
    private WebElement elementHeaderTitle;
    @FindBy(css = "div[class='orangehrm-login-form'] > form > div > div > span")
    private WebElement noInputUsername;
    @FindBy(css = "div[class='orangehrm-login-form'] > form > div:nth-child(3) > div >span")
    private WebElement noInputPassword;
    @FindBy(css = "div[class='orangehrm-login-form'] > div > div > div >p")
    private WebElement invalidUsernameOrPassword;

    private final String correctUsername = "Admin";
    private final String correctPassword = "admin123";
    private final String incorrectUsername = "aaaaaa";
    private final String incorrectPassword = "aaaaaa";
    private final String headerTitle = "Dashboard";
    private final String noUsernameOrPasswordMessage = "Required";
    private final String invalidAccountMessage = "Invalid credentials";
    
    public final String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    public void inputCorrectUsername(){
        basePage.enterText(username,correctUsername);
    }
    public void inputCorrectPassword(){
        basePage.enterText(password, correctPassword);
    }
    public void inputIncorrectUsername(){
        basePage.enterText(username, incorrectUsername);
    }
    public void inputIncorrectPassword(){
        basePage.enterText(password, incorrectPassword);
    }
    public void clickLoginButton(){
        basePage.click(loginButton);
    }
    public String getHeaderTitle(){
        return basePage.getText(elementHeaderTitle);
    }
    public void checkLoginSuccessful(){
        Assert.assertEquals(getHeaderTitle(),headerTitle);
    }
    public void checkLoginFailedNoUsername(){
        Assert.assertEquals(basePage.getText(noInputUsername),noUsernameOrPasswordMessage);

    }
    public void checkLoginFailedNoPassword(){
        Assert.assertEquals(basePage.getText(noInputPassword),noUsernameOrPasswordMessage);
    }
    public void checkLoginFailedNoUsernameAndPassword(){
        Assert.assertEquals(basePage.getText(noInputUsername),noUsernameOrPasswordMessage);
        Assert.assertEquals(basePage.getText(noInputPassword),noUsernameOrPasswordMessage);
    }
    public void checkLoginFailedInvalidAccount(){
        Assert.assertEquals(basePage.getText(invalidUsernameOrPassword),invalidAccountMessage);
    }
}
