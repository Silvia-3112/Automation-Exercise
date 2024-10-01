package StepDefinition24;

import Base.BaseClass;
import Pom.Task24;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step24 extends BaseClass {
    Task24 task24;
    private String accInfo;
    private String reviewOrder;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task24=new Task24(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
    Assert.assertTrue(task24.visibleHomePage());
    }
    @When("User Add products to cart")
    public void userAddProductsToCart() {
        task24.clickOnProductsBtn();
        task24.mouseHoverToFirstProd();
        task24.clickOnOverlayFirstAddCart();
        task24.clickOnOverlayContinue();
    }
    @When("User Click {string} button")
    public void userClickButton(String cart) {
        task24.clickOnCartBtn();
    }
    @Then("User Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() {
        Assert.assertTrue(task24.verifyPage());
    }
    @When("User Click Proceed To Checkout")
    public void userClickProceedToCheckout() {
        task24.clickOnProceedToCheckout();
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String login) {
        task24.clickOnRegOrLogin();
    }
    @When("User Fill all details in Signup and create account")
    public void userFillAllDetailsInSignupAndCreateAccount() {
        task24.addNameAndEmail();
        task24.clickOnSignUp();
        task24.addAccInfo();
        task24.clickOnNewsLetter();
        task24.clickOnSplOffer();
        task24.addAddressInfo();
        task24.clickOnCreateAccBtn();
    }
    @Then("User Verify {string} and click {string} button")
    public void userVerifyAndClickButton(String accountCreated, String cont) {
        Assert.assertTrue(task24.visibleAccCreated());
        task24.clickOnContinue();
    }
    @Then("User Verify {string} at top")
    public void userVerifyAtTop(String loggedIn) {
        Assert.assertTrue(task24.visibleLoggedInAs());

    }
    @When("User Click on the {string} button")
    public void userClickOnTheButton(String cart1) {
    task24.clickOnCart1Btn();
    }
    @When("User Click the {string} button")
    public void userClickTheButton(String check) {
    task24.clickOnProceedToCheckout1();
    }
    @Then("User Verify Address Details and Review Your Order")
    public void userVerifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(task24.getAccDetailTxt());
        Assert.assertTrue(task24.getReviewUrOrderTxt());
    }
    @When("User Enter description in comment text area and click {string}")
    public void userEnterDescriptionInCommentTextAreaAndClick(String text) {
        task24.addMessageInDescription("Good");
        task24.clickOnPlaceOrder();
    }
    @When("User Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        task24.addCardDetail("Alwin", "12345", "123", "May", "2030");
    }
    @When("User Click that {string} button")
    public void userClickThatButton(String string) {
        task24.clickOnPayBtn();
    }
    @Then("User Verify success message {string}")
    public void userVerifySuccessMessage(String success) {
        Assert.assertTrue(task24.verifySuccessAlert());

    }
    @When("User Click {string} button and verify invoice is downloaded successfully.")
    public void userClickButtonAndVerifyInvoiceIsDownloadedSuccessfully(String invoice) throws InterruptedException {
        task24.clickOnDownloadInvoice();
        Assert.assertTrue(task24.verifyInvoiceDownloaded());
    }
    @When("User Click that the {string} button")
    public void userClickThatTheButton(String con) {
        task24.clickOnContBtn();

    }
    @When("User press {string} button")
    public void userPressButton(String dele) {
        task24.clickOnAccDelete();
    }
    @Then("User verify {string} and click the {string} button")
    public void userVerifyAndClickTheButton(String accountDeleted  ,String contin) {
        Assert.assertTrue(task24.visibleAccDeleted());
        task24.clickOnAccDelContinue();
    }
}


