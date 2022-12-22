package Tests;

import Data.DataToInput;
import Steps.DetailStep;
import Steps.HomeSteps;
import Steps.LoginSteps;
import Steps.NewPostSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewPostTest extends BaseTest
{
    DataToInput date = new DataToInput();
    LoginSteps loginSteps = new LoginSteps(driver);
    HomeSteps homeSteps = new HomeSteps(driver);
    NewPostSteps newPostSteps = new NewPostSteps(driver);
    DetailStep detailStep = new DetailStep(driver);

    @Test(description = "Scenario 1: User creates post")
    public void NewPost()
    {
        visit("https://sheltered-mesa-19374.herokuapp.com/accounts/login/?next=/about/");
        loginSteps.inputUserName(date.user);
        loginSteps.inputPassword(date.password);
        loginSteps.cliclLogInButton();

        homeSteps.clickNewPost();

        newPostSteps.fillTitle(date.title);
        newPostSteps.fillSubTitle(date.subTitle);
        newPostSteps.fillBody(date.body);
        newPostSteps.clickCreate();

        Assert.assertEquals(date.title, detailStep.getTitleText());
        Assert.assertEquals(date.subTitle, detailStep.getSubTitle());
        Assert.assertEquals(date.body, detailStep.getBody());
        Assert.assertTrue(detailStep.getInfo().contains(date.user));
        Assert.assertTrue(detailStep.getInfo().contains(detailStep.getDate()));
    }

    @Test(description = "Scenario 2: User fails to create post because of missing title")
    public void NewPost_TitleMissing()
    {
        visit("https://sheltered-mesa-19374.herokuapp.com/accounts/login/?next=/about/");
        loginSteps.inputUserName(date.user);
        loginSteps.inputPassword(date.password);
        loginSteps.cliclLogInButton();

        homeSteps.clickNewPost();

        newPostSteps.fillSubTitle(date.subTitle);
        newPostSteps.fillBody(date.body);
        newPostSteps.clickCreate();

        Assert.assertTrue(Boolean.parseBoolean(newPostSteps.requieredTitleField()));
    }

    @Test(description = "Scenario 2: User fails to create post because of missing title")
    public void NewPost_SubTitleMissing()
    {
        visit("https://sheltered-mesa-19374.herokuapp.com/accounts/login/?next=/about/");
        loginSteps.inputUserName(date.user);
        loginSteps.inputPassword(date.password);
        loginSteps.cliclLogInButton();

        homeSteps.clickNewPost();

        newPostSteps.fillTitle(date.title);
        newPostSteps.fillBody(date.body);
        newPostSteps.clickCreate();

        Assert.assertTrue(Boolean.parseBoolean(newPostSteps.requieredSubTitleField()));
    }
}
