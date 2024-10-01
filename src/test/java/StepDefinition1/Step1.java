package StepDefinition1;

import Base.BaseClass;
import Pom.Task1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step1 extends BaseClass {
    Task1 task1;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task1 = new Task1(driver);
    }

    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }

    @Then("User Verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(task1.setHomePage());
    }

    @When("User Click on {string} button")
    public void userClickOnButton(String signUpLogin) throws InterruptedException {
    task1.clickSignUpBtn();
    }

    @Then("User Verify {string} is visible")
    public void userVerifyIsVisible(String text) {
    Assert.assertTrue(task1.setTextVisible());
    }

    @When("User Enter the  name and email address")
    public void userEnterTheNameAndEmailAddress() {
        task1.addNameEmail("Ferdin Silvia","ferdinsilvia2@gmail.com");
    }

    @When("User Click the {string} button")
    public void userClickTheButton(String signup) {
    task1.clickSignupBtn();
    }

    @Then("User Verify that the text {string} is visible")
    public void userVerifyThatTheTextIsVisible(String text1) {
        Assert.assertTrue(task1.setTextVisible1());
    }

    @When("User Fill details: Title, Name, Email, Password, Date of birth")
    public void userFillDetailsTitleNameEmailPasswordDateOfBirth() {
        task1.clickTitleRadioBtn();
        task1.addPassword("silvia77#");
        task1.selDay();
        task1.selMonth();
        task1.selYear();
    }

    @When("User Select checkbox {string}")
    public void userSelectCheckbox(String checkBox) {
    task1.clickCheckBox1Btn();
    task1.clickCheckBox2Btn();
    }

    @When("User Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void userFillDetailsFirstNameLastNameCompanyAddressAddress2CountryStateCityZipcodeMobileNumber() {
   task1.addFirstName("Ferdin");
   task1.addLastName("Silvia");
   task1.addCompany("Axess");
   task1.addAddress("345,Tidel Park","Tharamani");
   task1.selCountry();
   task1.addStateCity("Tamil Nadu", "Chennai");
   task1.addCodeMobile("600096","9876543210");
    }


    @When("User Click {string}")
    public void userClick(String createAccount) {
    task1.clickCreateAccountBtn();
    }

    @Then("User Verify that text {string} is visible")
    public void userVerifyThatTextIsVisible(String text2 ){
        Assert.assertTrue(task1.setTextVisible2());
    }
    @When("User Click the button continue {string}")
    public void userClickTheButtonContinue(String conti){
        task1.clickContinueBtn();
    }
    @Then("User Verify that {string} is visible")
    public void userVerifyThatIsVisible(String text3 ){
        Assert.assertTrue(task1.setTextVisible3());
    }
    @When("User Click {string} button")
    public void userClickButton(String deleteAccount) {
        task1.clickDeleteAccountBtn();
    }
    @Then("User Verify that {string} is visible and click {string} button")
    public void userVerifyThatIsVisibleAndClickButton(String text4, String cont) {
        Assert.assertTrue(task1.setTextVisible4());
        task1.clickContBtn();
    }
}