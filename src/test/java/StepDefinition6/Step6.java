package StepDefinition6;

import Base.BaseClass;
import Pom.Task2;
import Pom.Task6;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step6 extends BaseClass {
    Task6 task6;
    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task6 = new Task6(driver);
    }

    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task6.setHomePage());
    }

    @When("User Click on {string} button")
    public void userClickOnButton(String contact) throws InterruptedException {
        task6.clickContactUsBtn();
    }

    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String getInTouch) {
    Assert.assertTrue(task6.setTextVisible());
    }

    @When("User Enter name, email, subject and message")
    public void userEnterNameEmailSubjectAndMessage() {
    task6.addNameEmail("Ferdin","ferdinsilvia12@gmail.com");
    task6.addSubjectMessage("Feedback","Good");
    }

    @When("User Upload file")
    public void userUploadFile() {
    task6.chooseFile();
    }

    @When("User Click {string} button")
    public void userClickButton(String submit) {
    task6.clickSubmitBtn();
    }

    @When("User Click OK button")
    public void userClickOKButton() {
    task6.clickOk();
    }

    @Then("User Verify success message {string} is visible")
    public void userVerifySuccessMessageIsVisible(String string) {
    Assert.assertTrue(task6.setTextVisible1());
    }

    @Then("Click {string} button and verify that landed to home page successfully")
    public void clickButtonAndVerifyThatLandedToHomePageSuccessfully(String string) {
    task6.clickHomeBtn();
    Assert.assertTrue(task6.verifyNavigateToHomePage());
    }
}