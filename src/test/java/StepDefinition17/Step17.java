package StepDefinition17;

import Base.BaseClass;
import Pom.Task17;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step17 extends BaseClass {
    Task17 task17;

    @Given("User Launch the browser {string} browser")
    public void userLaunchTheBrowserBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task17 = new Task17(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task17.setHomePage());
    }
    @When("User Add products to cart")
    public void userAddProductsToCart() throws InterruptedException {
        task17.clickProductsBtn();
        task17.mouseHoverToFirstProd();
        task17.clickOnFirstAddCart();
        task17.clickOnContinue();
        task17.mouseHoverToSecondProd();
        task17.clickOnSecondAddCart();
        task17.clickOnContinue();
    }
    @When("User Click {string} button")
    public void userClickButton(String string) {
        task17.clickCartBtn();
    }
    @Then("User Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() {
        Assert.assertTrue(task17.verifyCartPage());
    }
    @When("User Click {string} button corresponding to particular product")
    public void userClickButtonCorrespondingToParticularProduct(String remove) {
        task17.clickFirstProdToRemove();
    }
    @Then("User Verify that product is removed from the cart")
    public void userVerifyThatProductIsRemovedFromTheCart() throws InterruptedException {
        Assert.assertFalse(task17.verifyFirstProdRemoved());
    }

}
