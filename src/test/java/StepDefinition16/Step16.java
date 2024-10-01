package StepDefinition16;

import Base.BaseClass;
import Pom.Task16;
import Pom.Task2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step16 extends BaseClass{
    Task16 task16;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task16 = new Task16(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task16.setHomePage());
    }
    @When("User Click {string} button")
    public void userClickButton(String signUpLogin) throws InterruptedException {
        task16.clickSignUpBtn();
    }
    @When("User Fill email, password and click {string} button")
    public void userFillEmailPasswordAndClickButton(String fill) {
        task16.addEmailPassword("ferdinsilvia11@gmail.com","silvia7#");
        task16.clickLoginBtn();
    }
    @Then("User Verify {string} at top")
    public void userVerifyAtTop(String loggedIn) {
        Assert.assertTrue(task16.setTextVisible1());
    }
    @When("User Add products to cart")
    public void userAddProductsToCart() throws InterruptedException {
        task16.clickProductsBtn();
        task16.mouseHoverToFirstProd();
        task16.clickOnFirstAddCart();
        task16.clickOnContinue();
        task16.mouseHoverToSecondProd();
        task16.clickOnSecondAddCart();
    }
    @When("User Click the {string} button")
    public void userClickTheButton(String cart) {
        task16.clickCartBtn();
    }
    @Then("User Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() {
        Assert.assertTrue(task16.verifyCartPage());
    }
    @When("User Click Proceed To Checkout")
    public void userClickProceedToCheckout() {
        task16.clickCheckOutBtn();
    }
    @Then("User Verify Address Details and Review Your Order")
    public void userVerifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(task16.getAddressDetailTxt());
        Assert.assertTrue(task16.getReviewUrOrderTxt());
    }
    @When("User Enter description in comment text area and click {string}")
    public void userEnterDescriptionInCommentTextAreaAndClick(String comment) {
        task16.addComment("Nice");
        task16.clickPlaceOrderBtn();
    }
    @When("User Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        task16.addNameOnCard("Alwin");
        task16.addCardNumber("12345");
        task16.addCvc("123");
        task16.addExpiryMonth("May");
        task16.addExpiryYear("2030");
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String payBtn) {
        task16.clickPayAndConfirmOrderBtn();
    }
    @Then("User Verify success message {string}")
    public void userVerifySuccessMessage(String success) {
        Assert.assertTrue(task16.setTextVisible4());
    }
    @When("User Click on the {string} button")
    public void userClickOnTheButton(String delete) {
        task16.clickDeleteAccountBtn();
    }
    @Then("User Verify {string} and click the {string} button")
    public void userVerifyAndClickTheButton(String accountDeleted, String conti) {
        Assert.assertTrue(task16.setTextVisible5());
        task16.clickContBtn();
    }

}
