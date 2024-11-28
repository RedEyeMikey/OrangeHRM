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

    //Search and delete employee
    private final By searchIdBlock = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div >form > div > div > div:nth-child(2) > div > div:nth-child(2) > input");
    private final By searchButton =By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div >form > div > button:nth-child(2)");
    private final By employeeInfo = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div:nth-child(3) > div > div");
    private final By employeeId = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div:nth-child(3) > div > div >div > div > div > div > div > div > div > div:nth-child(2)");
    private final By deleteButton = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2)  > div > div > div:nth-child(2) > div > div > button ");
    private final By confirmDeleteButton = By.cssSelector("div[id='app'] > div:nth-child(3) > div > div > div > div:nth-child(4) > button:nth-child(2)");
    private final By deleteSuccessfulNotification = By.cssSelector("div[id='app'] > div:nth-child(2) > div > div > div:nth-child(2) > p:nth-child(2)");
    private final By foundRecord = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div:nth-child(2) > div > span");
    private final By idCheckBox = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div:nth-child(3) > div> div:nth-child(2) > div > div > div > div > div >label > span");


    private final String foundRecordMessage = "No Records Found";
    private final String deleteSuccessfulMessage = "Successfully Deleted";

    public void searchEmployee(){
        click(searchIdBlock);
        enterText(searchIdBlock,id);
        click(searchButton);
    }
    public void scrollToEmployee(){
        scrollToElement(employeeInfo);
    }
    public void checkCorrectId(){
//        Assert.assertEquals(find(employeeId).toString(),id);
    }
    public void deleteEmployee(){
        click(idCheckBox);
        click(deleteButton);
        click(confirmDeleteButton);
    }
    public void checkSuccessfullyDeleted(){
        Assert.assertEquals(getText(deleteSuccessfulNotification),deleteSuccessfulMessage);

    }
    public void checkNoExistingUser(){
        waitForVisibility(foundRecord);
        scrollToElement(foundRecord);
        Assert.assertEquals(getText(foundRecord),foundRecordMessage);
    }
}
