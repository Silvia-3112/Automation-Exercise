package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task2 extends BaseClass {
    WebDriver driver;

    public Task2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement signUpLoginBtn;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement textVisible;

    @FindBy(xpath = "//form[@action='/login']//input[@placeholder='Email Address']")
    private WebElement email;

    @FindBy(xpath= "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement login;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    private WebElement textVisible1;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    private WebElement deleteAccountBtn;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeletedText;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }

    public void clickSignUpBtn() throws InterruptedException {
        Thread.sleep(2000);
        signUpLoginBtn.click();
    }

    public boolean setTextVisible() {
        boolean isVisible1 = textVisible.isDisplayed();
        return isVisible1;
    }

    public void addEmailPassword(String emailid, String pword) {
        email.sendKeys(emailid);
        password.sendKeys(pword);
    }
    public void clickLoginBtn() {
        login.click();
    }
    public boolean setTextVisible1() {
        boolean isVisible2 = textVisible1.isDisplayed();
        return isVisible2;
    }
    public void clickDeleteAccountBtn() {
        deleteAccountBtn.click();
    }
    public boolean setTextVisible2() {
        boolean isVisible3 = accountDeletedText.isDisplayed();
        return isVisible3;
    }
}
