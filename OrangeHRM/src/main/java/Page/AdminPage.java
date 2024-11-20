package Page;

import Base.BasePage;
import org.openqa.selenium.By;

public class AdminPage extends BasePage {
    private final By adminButton = By.cssSelector("div[id='app'] > div > div > aside > nav > div:nth-child(2) > ul > li:nth-child(1) > a");
    private final By addAdminButton = By.cssSelector("div[id='app'] > div > div:nth-child(2) > div:nth-child(2) > div > div > div > button ");
//    private final By userRoleDropdown;
//    private final By employeeNameBlock;
//    private final By statusDropdown;
//    private final By usernameBlock;
//    private final By passwordBlock;
//    private final By confirmPasswordBlock;

}
