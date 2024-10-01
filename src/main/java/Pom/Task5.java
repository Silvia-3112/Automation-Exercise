package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task5 extends BaseClass {
    WebDriver driver;

    public Task5(WebDriver driver) {
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

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    private WebElement textVisible1;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }

    public void clickSignUpLoginBtn() throws InterruptedException {
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

}
