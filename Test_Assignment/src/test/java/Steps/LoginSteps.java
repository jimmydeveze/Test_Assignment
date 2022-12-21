package Steps;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps extends BaseSteps
{
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    public void inputUserName(String inputText)
    {
        loginPage.getUserNameFieldLocator().sendKeys(inputText);
    }

    public void inputPassword(String inputText)
    {
        loginPage.getPasswordFieldLocator().sendKeys(inputText);
    }

    public void cliclLogInButton()
    {
        click(loginPage.getLogInbuttonLocator());
    }

    public LoginSteps(WebDriver driver)
    {
        super(driver);
    }
}
