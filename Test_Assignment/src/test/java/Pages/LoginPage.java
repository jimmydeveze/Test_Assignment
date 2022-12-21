package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage
{
    @FindBy(how = How.NAME, using = "username")
    private WebElement userNameFieldLocator;

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordFieldLocator;

    @FindBy(how = How.XPATH, using = "//input[@type=\"submit\"]")
    private WebElement logInbuttonLocator;

    public WebElement getLogInbuttonLocator()
    {
        return  logInbuttonLocator;
    }

    public WebElement getPasswordFieldLocator()
    {
        return  passwordFieldLocator;
    }

    public WebElement getUserNameFieldLocator()
    {
        return userNameFieldLocator;
    }

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
}
