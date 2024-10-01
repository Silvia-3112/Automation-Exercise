package StepDefinition12;

import Base.BaseClass;
import Pom.Task12;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step12 extends BaseClass {
    Task12 task12;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task12 = new Task12(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task12.setHomePage());
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String productsBtn){
        task12.clickProductsBtn();
    }
    @When("User Hover over first product and click {string}")
    public void userHoverOverFirstProductAndClick(String addCart) throws InterruptedException {
        task12.mouseHoverToFirstProd();
        task12.clickOnFirstAddCart();
    }
    @When("User Click {string} button")
    public void userClickButton(String continueBtn) throws InterruptedException {
        task12.clickOnContinue();
    }
    @When("User Hover over second product and click {string}")
    public void userHoverOverSecondProductAndClick(String cart) throws InterruptedException {
        task12.mouseHoverToSecondProd();
        task12.clickOnSecondAddCart();

    }
    @When("User Click on the {string} button")
    public void userClickOnTheButton(String cartBtn) throws InterruptedException {
        task12.clickOnCart();
    }
    @Then("User Verify both products are added to Cart")
    public void userVerifyBothProductsAreAddedToCart() throws InterruptedException {
        Assert.assertTrue(task12.verifyFirstProd());
        Assert.assertTrue(task12.verifySecondProd());
    }
    @Then("User Verify their prices, quantity and total price")
    public void userVerifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(task12.verifyFirstProdPrice());
        Assert.assertTrue(task12.verifySecondProdPrice());
        Assert.assertTrue(task12.verifyFirstProdQty());
        Assert.assertTrue(task12.verifySecondProdQty());
        Assert.assertTrue(task12.verifyFirstProdTotalPrice());
        Assert.assertTrue(task12.verifySecondProdTotalPrice());

    }

}
