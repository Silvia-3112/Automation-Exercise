package StepDefinition4;

import Base.BaseClass;
import Pom.Task2;
import Pom.Task4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step4 extends BaseClass {
    Task4 task4;
    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task4 = new Task4(driver);
    }

    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task4.setHomePage());
    }

    @When("User Click on {string} button")
    public void userClickOnButton(String signUpLogin) throws InterruptedException {
        task4.clickSignUpBtn();
    }

    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String text) {
        Assert.assertTrue(task4.setTextVisible());
    }

    @When("User Enter correct email address and password")
    public void userEnterCorrectEmailAddressAndPassword() {
        task4.addEmailPassword("ferdinsilvia12@gmail.com","silvia#");
    }
    @When("User Click the {string} button")
    public void userClickTheButton(String login) {

        task4.clickLoginBtn();
    }

    @Then("User Verify that {string} is visible")
    public void userVerifyThatIsVisible(String loggedInAsUsername) {
        Assert.assertTrue(task4.setTextVisible1());
    }
    @When("User Click {string} button")
    public void userClickButton(String logOut) {
        task4.clickLogOutBtn();
    }
    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(task4.verifyNavigateToLoginPage());
    }
}
