package StepDefinition14;

import Base.BaseClass;
import Pom.Task14;
import Pom.Task4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Base.BaseClass.driver;

public class Step14 {
    Task14 task14;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task14 = new Task14(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task14.setHomePage());
    }
    @When("User Add products to cart")
    public void userAddProductsToCart() throws InterruptedException {
        task14.clickProductsBtn();
        task14.mouseHoverToFirstProd();
        task14.clickOnFirstAddCart();
        task14.clickOnContinue();
        task14.mouseHoverToSecondProd();
        task14.clickOnSecondAddCart();
    }
    @When("User Click {string} button")
    public void userClickButton(String cartBtn) {
        task14.clickCartBtn();
    }
    @Then("User Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() {
        Assert.assertTrue(task14.verifyCartPage());
    }
    @When("User Click Proceed To Checkout")
    public void userClickProceedToCheckout() {
    task14.clickCheckOutBtn();

    }
    @When("User Click that {string} button")
    public void userClickThatButton(String registerBtn) {
        task14.clickRegisterLoginBtn();
    }
    @When("User Fill all details in Signup and create account")
    public void userFillAllDetailsInSignupAndCreateAccount() throws InterruptedException {
        task14.addNameEmailBtn("Ferdin","ferdinsilvia235@gmail.com");
        task14.clickSignUpBtn();
        task14.clickTitleRadioBtn();
        task14.addPassword("silvia7#");
        task14.selDay();
        task14.selMonth();
        task14.selYear();
        task14.clickCheckBox1Btn();
        task14.clickCheckBox2Btn();
        task14.addFirstName("Ferdin");
        task14.addLastName("Silvia");
        task14.addCompany("Axess");
        task14.addAddress("314,Tidel Park","Tharamani");
        task14.selCountry();
        task14.addStateCity("Tamil Nadu","Chennai");
        task14.addCodeMobile("600096","9876543210");
        task14.clickCreateAccountBtn();
    }

    @Then("User Verify {string} and click {string} button")
    public void userVerifyAndClickButton(String account, String conti) {
     Assert.assertTrue(task14.setTextVisible2());
     task14.clickContinueBtn();
    }
    @Then("User Verify {string} at top")
    public void userVerifyAtTop(String loggedIn) {
        Assert.assertTrue(task14.setTextVisible3());
    }
    @When("User Click the {string} button")
    public void userClickTheButton(String cart) {

        task14.clickCart1Btn();
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String checkOut) {
        task14.clickCheckOut1Btn();
    }
    @Then("User Verify Address Details and Review Your Order")
    public void userVerifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(task14.getAddressDetailTxt());
        Assert.assertTrue(task14.getReviewUrOrderTxt());
    }
    @When("User Enter description in comment text area and click {string}")
    public void userEnterDescriptionInCommentTextAreaAndClick(String btn) {
        task14.addComment("Nice");
        task14.clickPlaceOrderBtn();
    }
    @When("User Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
       task14.addNameOnCard("Alwin");
        task14.addCardNumber("12345");
        task14.addCvc("123");
        task14.addExpiryMonth("May");
        task14.addExpiryYear("2030");

    }
    @When("User Click that the {string} button")
    public void userClickThatTheButton(String pay) {
        task14.clickPayAndConfirmOrderBtn();
    }
    @Then("User Verify success message {string}")
    public void userVerifySuccessMessage(String success) {

        Assert.assertTrue(task14.setTextVisible4());
    }
    @When("User Click on the {string} button")
    public void userClickOnTheButton(String delete) {

        task14.clickDeleteAccountBtn();
    }
    @Then("User Verify the {string} and click {string} button")
    public void userVerifyTheACCOUNTDELETEDAndClickContinueButton() {
        Assert.assertTrue(task14.setTextVisible5());
        task14.clickContBtn();
    }
}
