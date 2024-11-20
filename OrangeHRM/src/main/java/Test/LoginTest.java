package Test;

import Base.BaseTest;
import Script.Step;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    Step step = new Step();

    @Test
    public void testCase01(){
        step.Login();
        step.Logout();
    }

}

