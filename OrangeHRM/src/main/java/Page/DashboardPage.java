package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DashboardPage extends BasePage {
    private final String headerTitle = "Dashboard";
    private final By elementHeaderTitle = By.cssSelector("div[id='app'] >div > div > header > div > div > span > h6");

    public String getHeaderTitle(){
        return getText(elementHeaderTitle);
    }
    public void checkLoginSuccessful(){
        Assert.assertEquals(getHeaderTitle(),headerTitle);
    }
}
