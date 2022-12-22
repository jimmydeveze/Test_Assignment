package Tests;

import Data.DataToInput;
import Steps.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditPostTest extends BaseTest
{
    DataToInput date = new DataToInput();
    LoginSteps loginSteps = new LoginSteps(driver);
    HomeSteps homeSteps = new HomeSteps(driver);
    NewPostSteps newPostSteps = new NewPostSteps(driver);
    DetailStep detailStep = new DetailStep(driver);
    PostSteps postSteps =new PostSteps(driver);

    @Test(description = "Scenario 1: User completely updates a post successfully")
    public void EditTitlePost()
    {
        visit("https://sheltered-mesa-19374.herokuapp.com/accounts/login/?next=/about/");
        loginSteps.inputUserName(date.user);
        loginSteps.inputPassword(date.password);
        loginSteps.cliclLogInButton();

        homeSteps.clickPost();
        postSteps.clickReadMore();
        detailStep.clickEditButton();

        newPostSteps.clearTitle();
        newPostSteps.clearSubTitle();
        newPostSteps.clearBody();

        newPostSteps.fillTitle(date.newTitle);
        newPostSteps.fillSubTitle(date.newSubTitle);
        newPostSteps.fillBody(date.newbody);
        newPostSteps.clickCreate();

        Assert.assertEquals(date.newTitle, detailStep.getTitleText());
        Assert.assertEquals(date.newSubTitle, detailStep.getSubTitle());
        Assert.assertEquals(date.newbody, detailStep.getBody());
        Assert.assertTrue(detailStep.getInfo().contains(date.user));
    }

    @Test(description = "Scenario 2: User partially updates a post successfully")
    public void EditPost()
    {
        visit("https://sheltered-mesa-19374.herokuapp.com/accounts/login/?next=/about/");
        loginSteps.inputUserName(date.user);
        loginSteps.inputPassword(date.password);
        loginSteps.cliclLogInButton();

        homeSteps.clickPost();
        postSteps.clickReadMore();
        detailStep.clickEditButton();

        newPostSteps.clearTitle();

        newPostSteps.fillTitle(date.title);
        newPostSteps.clickCreate();

        Assert.assertEquals(date.title, detailStep.getTitleText());
        Assert.assertTrue(detailStep.getInfo().contains(date.user));
    }


}
