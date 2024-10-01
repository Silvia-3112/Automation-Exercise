package StepDefinition26;

import Base.BaseClass;
import Pom.Task25;
import Pom.Task26;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step26 extends BaseClass {
    Task26 task26;


    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task26= new Task26(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task26.setHomePage());
    }
    @When("User Scroll down page to bottom")
    public void userScrollDownPageToBottom() {
        task26.scrollToFooter();
    }
    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String sub) {
        Assert.assertTrue(task26.setTextVisible());
    }
    @When("User Scroll up page to top")
    public void userScrollUpPageToTop() throws InterruptedException {
        task26.scrollUpPage();
    }
    @Then("User Verify that page is scrolled up and {string} text is visible on screen")
    public void userVerifyThatPageIsScrolledUpAndTextIsVisibleOnScreen(String scroll) throws InterruptedException {
        Assert.assertTrue(task26.verifyPageIsFullyScrolledUp());
        Assert.assertTrue(task26.verifyFullPledged());
    }

}
