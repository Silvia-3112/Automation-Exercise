package StepDefinition21;

import Base.BaseClass;
import Pom.Task21;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step21 extends BaseClass {
    Task21 task21;


    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task21=new Task21(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String products) {
        task21.clickProductsBtn();
    }
    @Then("User Verify user is navigated to ALL PRODUCTS page successfully")
    public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
    Assert.assertTrue(task21.verifyNavigateAllProductsPage());
    }
    @When("User Click on the {string} button")
    public void userClickOnTheButton(String viewBtn) {
        task21.clickViewProductBtn();
    }
    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String string) {
    Assert.assertTrue(task21.verifyWriteReviewVisible());
    }
    @When("User Enter name, email and review")
    public void userEnterNameEmailAndReview() {
    task21.addNameMailReview("Ferdin","ferdinsilvia11@gmail.com","nice");
    }
    @When("User Click {string} button")
    public void userClickButton(String submit) {
        task21.clickSubmitBtn();

    }
    @Then("User Verify success message {string}")
    public void userVerifySuccessMessage(String thankyou) {
        Assert.assertTrue(task21.verifyThankyouMessageVisible());
    }

}
