package StepDefinition10;

import Base.BaseClass;
import Pom.Task10;
import Pom.Task8;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step10 extends BaseClass {
    Task10 task10;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task10 = new Task10(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task10.setHomePage());
    }
    @When("User Scroll down to footer")
    public void userScrollDownToFooter() {
     task10.scrollToFooter();
    }
    @Then("User Verify text {string}")
    public void userVerifyText(String subscription) {
    Assert.assertTrue(task10.setTextVisible());
    }
    @When("User Enter email address in input and click arrow button")
    public void userEnterEmailAddressInInputAndClickArrowButton() {
        task10.addEmail("ferdinsilvia12@gmail.com");
        task10.clickArrowBtn();

    }
    @Then("User Verify success message {string} is visible")
    public void userVerifySuccessMessageIsVisible(String successMsg) {
    Assert.assertTrue(task10.verifySuccessfulMsg(successMsg));
    }

}
