package Tests;

import Data.PostDate;
import Pages.NewPostPage;
import Steps.HomeSteps;
import Steps.LoginSteps;
import Steps.NewPostSteps;
import org.testng.annotations.Test;

public class NewPostTest extends BaseTest
{
    PostDate date = new PostDate();
    LoginSteps loginSteps = new LoginSteps(driver);
    HomeSteps homeSteps = new HomeSteps(driver);
    NewPostSteps newPostSteps = new NewPostSteps(driver);

    @Test(description = "Simple login")
    public void NewPost()
    {
        visit("https://sheltered-mesa-19374.herokuapp.com/accounts/login/?next=/about/");
        loginSteps.inputUserName("Jimmy");
        loginSteps.inputPassword("9gagemmanuel");
        loginSteps.cliclLogInButton();

        homeSteps.clickNewPost();

        newPostSteps.fillTitle(date.title);
        newPostSteps.fillSubTitle(date.subTitle);
        newPostSteps.fillBody(date.body);
    }
}
