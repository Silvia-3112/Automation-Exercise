package StepDefinition22;

import Base.BaseClass;
import Pom.Task22;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step22 extends BaseClass {
    Task22 task22;


    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task22=new Task22(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);

    }
    @When("User Scroll to bottom of page")
    public void userScrollToBottomOfPage() {
    task22.scrollToFooter();
    }
    @Then("User Verify {string} are visible")
    public void userVerifyAreVisible(String items) {
    Assert.assertTrue(task22.setRecommendedItems());
    }
    @When("User Click on {string} on Recommended product")
    public void userClickOnOnRecommendedProduct(String product) {
    task22.mouseHoverToFirstProd();
    task22.clickOnFirstAddCart();
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String cart) throws InterruptedException {
    task22.clickOnCart();
    }
    @Then("User Verify that product is displayed in cart page")
    public void userVerifyThatProductIsDisplayedInCartPage() {
    Assert.assertTrue(task22.verifyCartPage());
    }


}
