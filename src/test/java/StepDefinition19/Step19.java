package StepDefinition19;

import Base.BaseClass;
import Pom.Task19;
import Pom.Task6;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step19 extends BaseClass {
    Task19 task19;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task19 = new Task19(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String products) {
    task19.clickProductsBtn();
    }
    @Then("User Verify that Brands are visible on left side bar")
    public void userVerifyThatBrandsAreVisibleOnLeftSideBar() {
    Assert.assertTrue(task19.verifyBrandsVisible());
    }
    @When("User Click on any brand name")
    public void userClickOnAnyBrandName() {
    task19.clickBrandName1Btn();
    }
    @Then("User Verify that user is navigated to brand page and brand products are displayed")
    public void userVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertTrue(task19.verifyNavigateBrandPage());
        Assert.assertTrue(task19.verifyBrandsProductsVisible());
    }
    @When("User On left side bar, click on any other brand link")
    public void userOnLeftSideBarClickOnAnyOtherBrandLink() {
    task19.clickBrandName2Btn();
    }
    @Then("User Verify that user is navigated to that brand page and can see products")
    public void userVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertTrue(task19.verifyNavigateToBrandPage());
        Assert.assertTrue(task19.verifyBabyHugProductsVisible());
    }

}
