package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PIMPage extends BasePage {

    private final By addEmployeeButton =By.cssSelector("div[id = 'app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div > button");

    private final By firstNameBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div  > form > div > div:nth-child(2) > div > div > div > div > div:nth-child(2) > div > div:nth-child(2) > input");
    private final By middleNameBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div  > form > div > div:nth-child(2) > div > div > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input");
    private final By lastNameBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div  > form > div > div:nth-child(2) > div > div > div > div > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > input");
    private final By idBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div  > form > div > div:nth-child(2)> div > div:nth-child(2) > div > div > div:nth-child(2)");
    private final By idInputBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div  > form > div > div:nth-child(2)> div > div:nth-child(2) > div > div > div:nth-child(2) > input");
    private final By saveButton = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > form > div >button:nth-child(3)");
    private final By saveSuccessNotification = By.cssSelector("div[id='app'] > div:nth-child(2) > div > div > div:nth-child(2) > p:nth-child(2)");
    private final By personalDetailsTitle = By.cssSelector("div[id = 'app'] > div > div:nth-child(2) > div:nth-child(2) >div > div > div > div:nth-child(2) > div > h6 ");

    private final String saveSuccessfulMessage = "Successfully Saved";

    private String firstName = "Dang";
    private String middleName = "Hai";
    private String lastName = "Binh";
    private String id = "21072002";

    public void clickAddEmployeeButton(){
        click(addEmployeeButton);
    }
    public void inputFirstName(){
        enterText(firstNameBlock,firstName);
    }
    public void inputMiddleName(){
        enterText(middleNameBlock,middleName);
    }
    public void inputLastName(){
        enterText(lastNameBlock, lastName);
    }
    //need check and fix
    public void inputId(){
        click(idBlock);
        deleteAll(idBlock);
        enterText(idInputBlock, id);
    }
    public void clickSaveButton(){
        click(saveButton);
    }
    public void checkSaveSuccessfulMessage(){
        Assert.assertEquals(getText(saveSuccessNotification), saveSuccessfulMessage);
    }
    public void waitForServerSaveAccount(){
        waitForVisibility(personalDetailsTitle);
    }

}
