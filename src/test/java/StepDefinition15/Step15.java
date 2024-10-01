package StepDefinition15;

import Base.BaseClass;
import Pom.Task1;
import Pom.Task15;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step15 extends BaseClass {
    Task15 task15;


    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task15 = new Task15(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task15.setHomePage());
    }
    @When("User Click {string} button")
    public void userClickButton(String signupLogin) throws InterruptedException {
        task15.clickSignUpBtn();
    }
    @When("User Fill all details in Signup and create account")
    public void userFillAllDetailsInSignupAndCreateAccount() {
        task15.addNameEmail("Ferdin","ferdinsilvia27@gmail.com");
        task15.clickSignupBtn();
        task15.clickTitleRadioBtn();
        task15.addPassword("silvia77#");
        task15.selDay();
        task15.selMonth();
        task15.selYear();
        task15.clickCheckBox1Btn();
        task15.clickCheckBox2Btn();
        task15.addFirstName("Ferdin");
        task15.addLastName("Silvia");
        task15.addCompany("Axess");
        task15.addAddress("345,Tidel Park","Tharamani");
        task15.selCountry();
        task15.addStateCity("Tamil Nadu", "Chennai");
        task15.addCodeMobile("600096","9876543210");
        task15.clickCreateAccountBtn();
    }
    @Then("User Verify {string} and click {string} button")
    public void userVerifyAndClickButton(String accountCreated, String cont) {
        Assert.assertTrue(task15.setTextVisible2());
        task15.clickContinueBtn();
    }
    @Then("User Verify {string} at top")
    public void userVerifyAtTop(String loggedIn) {
        Assert.assertTrue(task15.setTextVisible3());
    }
    @Then("User Add products to cart")
    public void userAddProductsToCart() throws InterruptedException {
        task15.clickProductsBtn();
        task15.mouseHoverToFirstProd();
        task15.clickOnFirstAddCart();
        task15.clickOnContinue();
        task15.mouseHoverToSecondProd();
        task15.clickOnSecondAddCart();
    }
    @Then("User Click on {string} button")
    public void userClickOnButton(String cart) {
        task15.clickCartBtn();
    }
    @Then("User Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() {
        Assert.assertTrue(task15.verifyCartPage());
    }
    @When("User Click the {string} button")
    public void userClickTheButton(String checkOut) {
        task15.clickCheckOutBtn();
    }
    @Then("User Verify Address Details and Review Your Order")
    public void userVerifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(task15.getAddressDetailTxt());
        Assert.assertTrue(task15.getReviewUrOrderTxt());
    }
    @When("User Enter description in comment text area and click {string}")
    public void userEnterDescriptionInCommentTextAreaAndClick(String comment) {
        task15.addComment("Nice");
        task15.clickPlaceOrderBtn();
    }
    @When("User Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        task15.addNameOnCard("Alwin");
        task15.addCardNumber("12345");
        task15.addCvc("123");
        task15.addExpiryMonth("May");
        task15.addExpiryYear("2030");

    }
    @When("User Click on the 'Pay and Confirm Order' button")
    public void userClickOnThePayAndConfirmOrderButton() {
        task15.clickPayAndConfirmOrderBtn();
    }
    @Then("User Verify success message {string}")
    public void userVerifySuccessMessage(String success) {
        Assert.assertTrue(task15.setTextVisible4());
    }
    @When("User Click the btn {string}")
    public void userClickTheBtn(String delete) {
        task15.clickDeleteAccountBtn();
    }
    @Then("User Verify {string} and click the {string} button")
    public void userVerifyAndClickTheButton(String accountDeleted, String continu) {
        Assert.assertTrue(task15.setTextVisible5());
        task15.clickContBtn();
    }

}
 //Assert.assertEquals(paymentDonePage.visibleAccDeleted(),string);
    //    paymentDonePage.clickOnContBtn();