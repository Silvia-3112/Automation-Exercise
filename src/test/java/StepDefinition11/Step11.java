package StepDefinition11;

import Base.BaseClass;
import Pom.Task10;
import Pom.Task11;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step11 extends BaseClass {
    Task11 task11;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task11 = new Task11(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task11.setHomePage());
    }
    @When("User Click {string} button")
    public void userClickButton(String cart) {
    task11.clickCartBtn();
    }
    @When("User Scroll down to footer")
    public void userScrollDownToFooter() {
        task11.scrollToFooter();
    }
    @Then("User Verify text {string}")
    public void userVerifyText(String subscription) {
        Assert.assertTrue(task11.setTextVisible());
    }
    @When("User Enter email address in input and click arrow button")
    public void userEnterEmailAddressInInputAndClickArrowButton() {
        task11.addEmail("ferdinsilvia12@gmail.com");
        task11.clickArrowBtn();
    }
    @Then("User Verify success message {string} is visible")
    public void userVerifySuccessMessageIsVisible(String successTxt) {
        Assert.assertTrue(task11.verifySuccessfulMsg(successTxt));
    }

}
