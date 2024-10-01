package StepDefinition25;

import Base.BaseClass;
import Pom.Task10;
import Pom.Task25;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step25 extends BaseClass {
    Task25 task25;


    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task25 = new Task25(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
         }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task25.setHomePage());
    }
    @When("User Scroll down page to bottom")
    public void userScrollDownPageToBottom() {
        task25.scrollToFooter();
    }
    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String sub) {
        Assert.assertTrue(task25.setTextVisible());
    }
    @When("User Click on arrow at bottom right side to move upward")
    public void userClickOnArrowAtBottomRightSideToMoveUpward() {
        task25.clickOnScrollUpArrow();
    }
    @Then("User Verify that page is scrolled up and {string} text is visible on screen")
    public void userVerifyThatPageIsScrolledUpAndTextIsVisibleOnScreen(String string) throws InterruptedException {
        Assert.assertTrue(task25.verifyPageIsFullyScrolledUp());
        Assert.assertTrue(task25.verifyFullPledged());
    }

}
