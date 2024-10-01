package Stepdefinition8;

import Base.BaseClass;
import Pom.Task8;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step8 extends BaseClass {
    Task8 task8;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task8 = new Task8(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task8.setHomePage());
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String products) {
        task8.clickProductsBtn();
    }
    @Then("User  Verify user is navigated to ALL PRODUCTS page successfully")
    public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(task8.verifyNavigateAllProductsPage());
    }
    @Then("User verify The products list is visible")
    public void userVerifyTheProductsListIsVisible() {
        Assert.assertTrue(task8.visibleAllProducts());
    }
    @When("User Click on {string} of first product")
    public void userClickOnOfFirstProduct(String viewProduct) {
        task8.clickFirstViewProductsBtn();
    }
    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        Assert.assertTrue(task8.verifyNavigateProductDetailsPage());
    }
    @Then("User Verify that  detail is visible: product name, category, price, availability, condition, brand")
    public void userVerifyThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        Assert.assertTrue(task8.verifyProductNameVisible());
        Assert.assertTrue(task8.verifyCategoryVisible());
        Assert.assertTrue(task8.verifyPriceVisible());
        Assert.assertTrue(task8.verifyAvailabilityVisible());
        Assert.assertTrue(task8.verifyConditionVisible());
        Assert.assertTrue(task8.verifyBrandVisible());

    }

}
