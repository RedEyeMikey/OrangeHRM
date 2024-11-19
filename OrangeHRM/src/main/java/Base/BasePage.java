package Base;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.BaseTest.driver;

public class BasePage {
    private final Duration IMPLICITLY_WAIT_TIME = Duration.ofSeconds(20);
    private final Duration EXPLICITLY_WAIT_TIME = Duration.ofSeconds(5);

    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void getUrl(String url){
        driver.get(url);
    }
    public void waitForVisibility(By locator){
        WebDriverWait wait = new WebDriverWait(driver, EXPLICITLY_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click (By locator){
        waitForVisibility(locator);
        find(locator).click();
    }
    public void enterText(By locator, String string){
        waitForVisibility(locator);
        find(locator).clear();
        find(locator).sendKeys(string);
    }
    public String getText(By locator){
        waitForVisibility(locator);
        return find(locator).getText();
    }

}
