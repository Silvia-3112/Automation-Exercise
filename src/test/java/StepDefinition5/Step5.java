package StepDefinition5;

import Base.BaseClass;
import Pom.Task2;
import Pom.Task5;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Base.BaseClass.driver;

public class Step5 {
    Task5 task5;
    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task5 = new Task5(driver);
    }

    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task5.setHomePage());
    }

    @When("User Click on {string} button")
    public void userClickOnButton(String signUpLogin) throws InterruptedException {
        task5.clickSignUpLoginBtn();
    }

    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String newUserSignup) {
        Assert.assertTrue(task5.setTextVisible());
    }

    @When("User Enter name and already registered email address")
    public void userEnterNameAndAlreadyRegisteredEmailAddress() {
        task5.addNameEmail("Ferdin","ferdinsilvia12@gmail.com");
    }
    @When("User Click {string} button")
    public void userClickTheButton(String signup) throws InterruptedException {
        task5.clickSignupBtn();
    }

    @Then("User Verify error {string} is visible")
    public void userVerifyThatIsVisible(String emailAddressalreadyexist) {
        Assert.assertTrue(task5.setTextVisible1());
    }
}
