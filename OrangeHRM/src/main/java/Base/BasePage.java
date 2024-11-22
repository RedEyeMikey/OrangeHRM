package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static Base.BaseTest.driver;

public class BasePage {
//    By locator;
//    private final Duration IMPLICITLY_WAIT_TIME = Duration.ofSeconds(20);
//    private final Duration EXPLICITLY_WAIT_TIME = Duration.ofSeconds(5);


    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void getUrl(String url) {
        driver.get(url);
    }

    public void waitForVisibility(By locator) {
        Wait<WebDriver> waitElementWebsite = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        waitElementWebsite.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
//    public void waitForClickable(By locator) {
//        Wait<WebDriver> waitElementWebsite = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofMillis(500))
//                .ignoring(NoSuchElementException.class);
//        waitElementWebsite.until(ExpectedConditions.elementToBeClickable(locator));
//    }

    public void click(By locator) {
        waitForVisibility(locator);
        find(locator).click();
    }

    public void enterText(By locator, String string) {
        waitForVisibility(locator);
        find(locator).clear();
        find(locator).sendKeys(string);
    }

    public String getText(By locator) {
        waitForVisibility(locator);
        return find(locator).getText();
    }
    public boolean isDisplayed(By locator){
        waitForVisibility(locator);
        return find(locator).isDisplayed();
    }
    public void selectAll(){
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL);
        action.sendKeys("a");
        action.keyUp(Keys.CONTROL);
    }
    public void deleteWithBackSpace(){
        Actions action = new Actions(driver);
        action.keyDown(Keys.BACK_SPACE);
        action.keyUp(Keys.BACK_SPACE);
    }

}
