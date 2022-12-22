package Steps;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeSteps extends BaseSteps
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    public void clickNewPost()
    {
        homePage.getNewPostLinkLocator().click();
    }

    public HomeSteps(WebDriver driver)
    {
        super(driver);
    }
}
