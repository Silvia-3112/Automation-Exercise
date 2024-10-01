package StepDefinition13;

import Base.BaseClass;
import Pom.Task13;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step13 extends BaseClass {
    Task13 task13;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task13= new Task13(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task13.setHomePage());
    }
    @When("User Click {string} for any product on home page")
    public void userClickForAnyProductOnHomePage(String viewProduct) {
       task13.clickViewProductBtn();
    }
    @Then("User Verify product detail is opened")
    public void userVerifyProductDetailIsOpened() {
        Assert.assertTrue(task13.verifyProductDetailPage());
    }
    @When("User Increase quantity to {int}")
    public void userIncreaseQuantityTo(Integer four) {
        task13.productIncQty();
    }
    @When("User Click {string} button")
    public void userClickButton(String addCart) {
        task13.clickAddCartBtn();
    }
    @When("User Click the {string} button")
    public void userClickTheButton(String viewCart) {
        task13.clickViewCartBtn();
    }
    @Then("User Verify that product is displayed in cart page with exact {string} quantity")
    public void userVerifyThatProductIsDisplayedInCartPageWithExactQuantity(String quantity) {
        Assert.assertTrue(task13.verifyProdQty(quantity));
    }

}
