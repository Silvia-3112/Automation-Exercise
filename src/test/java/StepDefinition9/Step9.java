package StepDefinition9;

import Base.BaseClass;
import Pom.Task8;
import Pom.Task9;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step9 extends BaseClass {
    Task9 task9;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task9 = new Task9(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task9.setHomePage());
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String string) {
        task9.clickProductsBtn();
    }
    @Then("User  Verify user is navigated to ALL PRODUCTS page successfully")
    public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(task9.verifyNavigateAllProductsPage());
    }
    @When("User Enter product name in search input and click search button")
    public void userEnterProductNameInSearchInputAndClickSearchButton() {
        task9.enterProdNameInSearchBox("Kids dress");
        task9.clickOnSearchBtn();
    }
    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String string) {
        Assert.assertTrue(task9.setTextVisible());

    }
    @Then("User Verify all the products related to search are visible")
    public void userVerifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(task9.visibleAllSearchProd());
    }

}
