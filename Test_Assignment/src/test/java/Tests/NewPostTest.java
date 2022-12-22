package Tests;

import Data.PostDate;
import Pages.NewPostPage;
import Steps.DetailStep;
import Steps.HomeSteps;
import Steps.LoginSteps;
import Steps.NewPostSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewPostTest extends BaseTest
{
    PostDate date = new PostDate();
    LoginSteps loginSteps = new LoginSteps(driver);
    HomeSteps homeSteps = new HomeSteps(driver);
    NewPostSteps newPostSteps = new NewPostSteps(driver);
    DetailStep detailStep = new DetailStep(driver);

    @Test(description = "User creates post")
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
        newPostSteps.clickCreate();

        Assert.assertEquals(date.title, detailStep.getTitleText());
        Assert.assertEquals(date.subTitle, detailStep.getSubTitle());
        Assert.assertEquals(date.body, detailStep.getBody());
    }
}
