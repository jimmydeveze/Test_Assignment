package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewPostPage extends BasePage
{
    @FindBy(how = How.ID, using = "id_title")
    private WebElement titleFieldLocator;

    @FindBy(how = How.ID, using = "id_subtitle")
    private WebElement subtitleFieldLocator;

    @FindBy(how = How.ID, using = "id_body")
    private WebElement bodyFieldLocator;

    @FindBy(how = How.XPATH, using = "//input[@type=\"submit\"]")
    private WebElement createButtonLocator;

    public WebElement getCreateButton()
    {
        return createButtonLocator;
    }

    public WebElement getBodyFieldLocator()
    {
        return bodyFieldLocator;
    }

    public WebElement getSubtitleFieldLocator()
    {
        return  subtitleFieldLocator;
    }

    public WebElement getTitleFieldLocator()
    {
        return titleFieldLocator;
    }

    public NewPostPage(WebDriver driver)
    {
        super(driver);
    }
}
