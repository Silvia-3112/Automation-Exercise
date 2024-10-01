package StepDefinition20;

import Base.BaseClass;
import Pom.Task20;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step20 extends BaseClass {
    Task20 task20;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task20=new Task20(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String products) {
        task20.clickProductsBtn();
    }
    @Then("User Verify user is navigated to ALL PRODUCTS page successfully")
    public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(task20.verifyNavigateAllProductsPage());
    }
    @When("User Enter product name in search input and click search button")
    public void userEnterProductNameInSearchInputAndClickSearchButton() {
        task20.enterProdNameInSearchBox("Saree");
        task20.clickOnSearchBtn();
    }
    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String searchProducts) {
        Assert.assertTrue(task20.setTextVisible());
    }
    @Then("User Verify all the products related to search are visible")
    public void userVerifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(task20.visibleAllSearchProd());
    }
    @When("User Add those products to cart")
    public void userAddThoseProductsToCart() throws InterruptedException {
        task20.mouseHoverToFirstProd();
        task20.clickOnFirstAddCart();
        task20.clickOnContinue();
        task20.mouseHoverToSecondProd();
        task20.clickOnSecondAddCart();
        task20.clickOnContinue1();
        task20.mouseHoverToThirdProd();
        task20.clickOnThirdAddCart();

    }
    @When("User Click {string} button and verify that products are visible in cart")
    public void userClickButtonAndVerifyThatProductsAreVisibleInCart(String cart) throws InterruptedException {
         task20.clickOnCart();
        Assert.assertTrue(task20.setFirstProduct());
        Assert.assertTrue(task20.setSecondProduct());
        Assert.assertTrue(task20.setThirdProduct());

    }
    @When("User Click {string} button and submit login details")
    public void userClickButtonAndSubmitLoginDetails(String signupBtn) throws InterruptedException {
    task20.clickSignUpBtn();
        task20.addEmailPassword("ferdinsilvia11@gmail.com","silvia7#");
        task20.clickLoginBtn();
    }
    @Then("User Again, go to Cart page")
    public void userAgainGoToCartPage() throws InterruptedException {
    task20.clickOnCart1();
    }
    @Then("User Verify that those products are visible in cart after login as well")
    public void userVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() throws InterruptedException {
        Assert.assertTrue(task20.verifyFirstProduct());

    }

}
