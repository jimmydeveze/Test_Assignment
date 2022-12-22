package Steps;

import Pages.PostPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PostSteps extends BaseSteps
{
    PostPage postPage = PageFactory.initElements(driver, PostPage.class);

    public void clickReadMore()
    {
        postPage.getReadMoreLocator().click();
    }

    public PostSteps(WebDriver driver)
    {
        super(driver);
    }
}
