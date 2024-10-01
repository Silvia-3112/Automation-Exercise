package StepDefinition7;

import Base.BaseClass;
import Pom.Task1;
import Pom.Task7;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step7 extends BaseClass {
    Task7 task7;
    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task7 = new Task7(driver);
    }

    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task7.setHomePage());
    }

    @When("User Click on {string} button")
    public void userClickOnButton(String string) throws InterruptedException {
        task7.clickTestCasesBtn();
    }

    @Then("User Verify user is navigated to test cases page successfully")
    public void userVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(task7.verifyNavigateToTestCasesPage());
    }
}