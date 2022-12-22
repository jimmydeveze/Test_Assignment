package Steps;

import Pages.NewPostPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewPostSteps extends BaseSteps
{
    NewPostPage newPostPage = PageFactory.initElements(driver, NewPostPage.class);

    public void fillTitle(String inputText)
    {
        newPostPage.getTitleFieldLocator().sendKeys(inputText);
    }

    public void fillSubTitle(String inputText)
    {
        newPostPage.getSubtitleFieldLocator().sendKeys(inputText);
    }

    public void fillBody(String inputText)
    {
        newPostPage.getBodyFieldLocator().sendKeys(inputText);
    }

    public NewPostSteps(WebDriver driver)
    {
        super(driver);
    }
}
