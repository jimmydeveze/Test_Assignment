package Tests;

import Steps.LoginSteps;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
    LoginSteps loginSteps = new LoginSteps(driver);

    @Test(description = "Simple login")
    public void logIn()
    {
        visit("https://sheltered-mesa-19374.herokuapp.com/accounts/login/?next=/about/");
        loginSteps.inputUserName("Jimmy");
        loginSteps.inputPassword("9gagemmanuel");
        loginSteps.cliclLogInButton();
    }
}
