package Steps;

import org.openqa.selenium.JavascriptExecutor;
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

    public  String getAttribute(WebElement locator, String attribute)
    {
        return locator.getAttribute(attribute);
    }

    public void higtLight(WebElement locator)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style','background: yellow;');", locator);
    }

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
