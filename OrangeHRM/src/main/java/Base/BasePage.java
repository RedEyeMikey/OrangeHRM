package Base;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.BaseTest.driver;

public class BasePage {
    protected WebDriverWait wait;

    public void getUrl(String url){
        driver.get(url);
    }
//    public void waitForVisibility(WebElement element){
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(element));
//
//    }
    public void click (WebElement element){
//        waitForVisibility(element);
        element.click();
    }
    public void enterText(WebElement element, String string){
//        waitForVisibility(element);
        element.clear();
        element.sendKeys(string);
    }
    public String getText(WebElement element){
//        waitForVisibility(element);
        return element.getText();
    }

}
