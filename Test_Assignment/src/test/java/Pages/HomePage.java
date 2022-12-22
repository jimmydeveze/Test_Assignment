package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage
{
    @FindBy(how = How.LINK_TEXT, using = "New Post")
    private WebElement newPostLinkLocator;

    public WebElement getNewPostLinkLocator()
    {
        return newPostLinkLocator;
    }

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
}
