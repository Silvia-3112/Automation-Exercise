package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends BaseClass {
    WebDriver driver;

    public Task1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement signUpLoginBtn;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement textVisible;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement name;

    @FindBy(xpath = "//form[@action='/signup']//input[@placeholder='Email Address']")
    private WebElement email;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signup;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement textVisible1;

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement title;

    @FindBy(id = "name")
    private WebElement name1;

    @FindBy(id = "email")
    private WebElement email1;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement day;

    @FindBy(id = "months")
    private WebElement month;

    @FindBy(id = "years")
    private WebElement year;

    @FindBy(id = "newsletter")
    private WebElement checkBox1;

    @FindBy(id = "optin")
    private WebElement checkBox2;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "company")
    private WebElement companyName;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "address2")
    private WebElement address2;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountBtn;

    @FindBy(xpath = "//b[text()='Account Created!']")
    private WebElement accountCreatedText;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    private WebElement loggedInText;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    private WebElement deleteAccountBtn;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeletedText;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement contBtn;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }

    public void clickSignUpBtn() throws InterruptedException {
        Thread.sleep(2000);
        signUpLoginBtn.click();
    }

    public boolean setTextVisible() {
        boolean isVisible = textVisible.isDisplayed();
        return isVisible;
    }

    public void addNameEmail(String username, String emailid) {
        name.sendKeys(username);
        email.sendKeys(emailid);
    }

    public void clickSignupBtn() {
        signup.click();
    }

    public boolean setTextVisible1() {
        boolean isVisible = textVisible1.isDisplayed();
        return isVisible;
    }

    public void clickTitleRadioBtn() {
        title.click();
    }

    public void addPassword(String pWord) {
        password.sendKeys(pWord);
    }

    public void selDay() {
        Select s = new Select(day);
        s.selectByVisibleText("31");
    }

    public void selMonth() {
        Select s = new Select(month);
        s.selectByVisibleText("December");
    }

    public void selYear() {
        Select s = new Select(year);
        s.selectByVisibleText("1984");
    }

    public void clickCheckBox1Btn() {
        checkBox1.click();
    }

    public void clickCheckBox2Btn() {
        checkBox2.click();
    }

    public void addFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void addLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void addCompany(String company) {
        companyName.sendKeys(company);
    }

    public void addAddress(String add1, String add2) {
        address1.sendKeys(add1);
        address2.sendKeys(add2);
    }

    public void selCountry() {
        Select s = new Select(country);
        s.selectByVisibleText("India");
    }

    public void addStateCity(String stat, String cit) {
        state.sendKeys(stat);
        city.sendKeys(cit);
    }

    public void addCodeMobile(String code, String num) {
        zipCode.sendKeys(code);
        mobileNumber.sendKeys(num);
    }

    public void clickCreateAccountBtn() {
        createAccountBtn.click();
    }
    public boolean setTextVisible2() {
        boolean isVisible = accountCreatedText.isDisplayed();
        return isVisible;
    }
    public void clickContinueBtn() {
        continueBtn.click();
    }
    public boolean setTextVisible3() {
        boolean isVisible = loggedInText.isDisplayed();
        return isVisible;
    }
    public void clickDeleteAccountBtn() {
        deleteAccountBtn.click();
    }
    public boolean setTextVisible4() {
        boolean isVisible = accountDeletedText.isDisplayed();
        return isVisible;
    }
    public void clickContBtn() {
        contBtn.click();
    }
}