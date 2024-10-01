package StepDefinition2;

import Base.BaseClass;
import Pom.Task2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Base.BaseClass.driver;

public class Step2 extends BaseClass {
    Task2 task2;
    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task2 = new Task2(driver);
    }

    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {

        Assert.assertTrue(task2.setHomePage());
    }

    @When("User Click on {string} button")
    public void userClickOnButton(String signUpLogin) throws InterruptedException {
        task2.clickSignUpBtn();
    }

    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String text) {
        Assert.assertTrue(task2.setTextVisible());
    }

    @When("User Enter correct email address and password")
    public void userEnterCorrectEmailAddressAndPassword() {
        task2.addEmailPassword("ferdinsilvia@gmail.com","silvia7#");
    }
    @When("User Click the {string} button")
    public void userClickTheButton(String login) {

        task2.clickLoginBtn();
    }

    @Then("User Verify that {string} is visible")
    public void userVerifyThatIsVisible(String text1) {

        Assert.assertTrue(task2.setTextVisible1());
    }
    @When("User Click {string} button")
    public void userClickButton(String deleteAccount) {
        task2.clickDeleteAccountBtn();
    }
    @Then("User  Verify that the text {string} is visible")
    public void userVerifyThatTheTextIsVisible(String text2) {
        Assert.assertTrue(task2.setTextVisible2());
    }

}

