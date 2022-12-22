package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostPage extends BasePage
{
    @FindBy(how = How.LINK_TEXT, using = "Read more")
    private WebElement readMoreLocator;

    public WebElement getReadMoreLocator()
    {
        return readMoreLocator;
    }

    public PostPage(WebDriver driver)
    {
        super(driver);
    }
}
