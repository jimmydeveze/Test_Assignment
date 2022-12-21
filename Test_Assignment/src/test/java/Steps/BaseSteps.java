package Steps;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseSteps
{
    WebDriver driver;

    public BaseSteps(WebDriver driver)
    {
        this.driver = driver;
    }

    /*//public void type(String inputText, WebElement locator)
    {
        locator.sendKeys(inputText);
    }*/

    /*public String getText(WebElement locator)
    {
        return locator.getText();
    }*/

    public void click(WebElement locator)
    {
        locator.click();;
    }

    public Boolean isDisplayed(WebElement locator)
    {
        try
        {
            return  locator.isDisplayed();
        }catch (NoSuchElementException e)
        {
            return false;
        }
    }
}
