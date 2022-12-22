package Steps;

import Pages.DetailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DetailStep extends BaseSteps
{
    DetailPage detailPage = PageFactory.initElements(driver, DetailPage.class);

    public String getTitleText()
    {
        return detailPage.getTitleLocator().getText();
    }

    public String getSubTitle()
    {
        return detailPage.getSubtitleLocator().getText();
    }

    public String getBody()
    {
        return detailPage.getBodyLocator().getText();
    }



    public DetailStep(WebDriver driver)
    {
        super(driver);
    }
}
