package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DetailPage extends BasePage
{
    @FindBy(how = How.XPATH, using = "//h1")
    private WebElement titleLocator;

    @FindBy(how = How.XPATH, using = "//h5")
    private WebElement subtitleLocator;

    @FindBy(how = How.XPATH, using = "//p")
    private  WebElement bodyLocator;

    @FindBy(how = How.XPATH, using = "//small")
    private WebElement infoLocator;

    public WebElement getInfoLocator()
    {
        return infoLocator;
    }

    public WebElement getBodyLocator()
    {
        return bodyLocator;
    }

    public WebElement getSubtitleLocator()
    {
        return  subtitleLocator;
    }

    public WebElement getTitleLocator()
    {
        return  titleLocator;
    }

    public DetailPage(WebDriver driver)
    {
        super(driver);
    }
}
