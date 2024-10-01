package StepDefinition3;

import Base.BaseClass;
import Pom.Task3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step3 extends BaseClass {
    Task3 task3;
    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task3 = new Task3(driver);
    }

    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task3.setHomePage());
    }

    @When("User Click on {string} button")
    public void userClickOnButton(String signUpLogin) throws InterruptedException {
        task3.clickSignUpBtn();
    }
    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String loginToYourAccount) {
        Assert.assertTrue(task3.setTextVisible());
    }

    @When("User Enter incorrect email address and password")
    public void userEnterIncorrectEmailAddressAndPassword(){
        task3.addEmailPassword("ferdinsilvia4@gmail.com","silvia#");
    }
    @When("User Click {string} button")
    public void userClickButton(String login) {
        task3.clickLoginBtn();
    }
    @Then("User Verify error {string} is visible")
    public void userVerifyErrorIsVisible (String incorrect){
        Assert.assertTrue(task3.setTextVisible1());
    }
}



