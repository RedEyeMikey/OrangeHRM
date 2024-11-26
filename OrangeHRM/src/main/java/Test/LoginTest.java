package Test;

import Base.BaseTest;
import Script.Step;
import Utils.CsvUtils;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

//import static Utils.CsvUtils.readCSVData;
//import static Utils.CsvUtils.readExcelData;


public class LoginTest extends BaseTest {
    Step step = new Step();

    @BeforeMethod
    public void loadWebsite() {
        basePage.getUrl(loginPage.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
//    @DataProvider (name = "account_data")
//    public Object[][] getAccountData() throws IOException, CsvValidationException {
//        return readCSVData("Data\\data.csv");
//    }
//    @Test()
//    public void testCase01(String username, String password){
//        step.loginDefaultAccount(username, password);
//        step.logout();
//    }
    @Test
    public void testCase02(){
        step.loginDefaultAccount();
        step.registerNewEmployee();
        step.registerNewAdminAccount();
        step.gotoDashboardPage();
        step.logout();
        step.loginNewAccount();
    }

}

