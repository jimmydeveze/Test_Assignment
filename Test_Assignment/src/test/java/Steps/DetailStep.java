package Steps;

import Pages.DetailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public String getInfo()
    {
        return detailPage.getInfoLocator().getText();
    }

    public String getDate()
    {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM. dd, yyyy,");
        return date.format(formatter).toString();
    }

    public DetailStep(WebDriver driver)
    {
        super(driver);
    }
}
