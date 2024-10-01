package StepDefinition23;

import Base.BaseClass;
import Pom.Task23;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step23 extends BaseClass {
    Task23 task23;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
    BaseClass.launchBrowser(browser);
    BaseClass.maximizeWindow();
    BaseClass.implicitlyWait();
    task23=new Task23(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
Assert.assertTrue(task23.setHomePage());
    }
    @When("User Click {string} button")
    public void userClickButton(String signUp) throws InterruptedException {
        task23.clickSignUpBtn();
    }
    @When("User Fill all details in Signup and create account")
    public void userFillAllDetailsInSignupAndCreateAccount() {
        task23.addNameEmail("Ferdin","ferdinsilvia359@gmail.com");
        task23.clickSignupBtn();
        task23.clickTitleRadioBtn();
        task23.addPassword("silvia77#");
        task23.selDay();
        task23.selMonth();
        task23.selYear();
        task23.clickCheckBox1Btn();
        task23.clickCheckBox2Btn();
        task23.addFirstName("Ferdin");
        task23.addLastName("Silvia");
        task23.addCompany("Axess");
        task23.addAddress("345,Tidel Park","Tharamani");
        task23.selCountry();
        task23.addStateCity("Tamil Nadu", "Chennai");
        task23.addCodeMobile("600096","9876543210");
        task23.clickCreateAccountBtn();
    }
    @Then("User Verify {string} and click {string} button")
    public void userVerifyAndClickButton(String accountCreated, String cont) {
        Assert.assertTrue(task23.setTextVisible2());
        task23.clickContinueBtn();
    }
    @Then("User Verify {string} at top")
    public void userVerifyAtTop(String loggedIn) {
        Assert.assertTrue(task23.setTextVisible3());
    }
    @When("User Add products to cart")
    public void userAddProductsToCart() throws InterruptedException {
        task23.clickProductsBtn();
        task23.mouseHoverToFirstProd();
        task23.clickOnFirstAddCart();
        task23.clickOnContinue();
        task23.mouseHoverToSecondProd();
        task23.clickOnSecondAddCart();
    }
    @When("User Click on {string} button")
    public void userClickOnButton(String cart) {
        task23.clickCartBtn();
    }
    @Then("User Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() {
        Assert.assertTrue(task23.verifyCartPage());
    }
    @When("User Click Proceed To Checkout")
    public void userClickProceedToCheckout() {
        task23.clickCheckOutBtn();
    }
    @Then("User Verify that the delivery address is same address filled at the time registration of account")
    public void userVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(task23.verifyDeliveryAddress());
    }
    @Then("User Verify that the billing address is same address filled at the time registration of account")
    public void userVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertTrue(task23.verifyBillingAddress());
    }
    @When("User Click on the {string} button")
    public void userClickOnTheButton(String delete) {
        task23.clickOnDelAccBtn();
    }
    @Then("User Verify {string} and click on {string} button")
    public void userVerifyAndClickOnButton(String accountDeleted, String continu) {
        Assert.assertTrue(task23.setTextVisible5());
        task23.clickContBtn();
    }
}
