package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.BaseClass.driver;

public class Task6 extends BaseClass {
    WebDriver driver;

    public Task6(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Contact us']")
    private WebElement contactUsBtn;

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    private WebElement textVisible;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement name;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement subject;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement message;

    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement uploadFile;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//div[text()='Success! Your details have been submitted successfully.']")
    private WebElement successMessage;

    @FindBy(xpath = "//span[text()=' Home']")
    private WebElement homeBtn;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }

    public void clickContactUsBtn() throws InterruptedException {
        Thread.sleep(2000);
        contactUsBtn.click();
    }

    public boolean setTextVisible() {
        boolean isVisible = textVisible.isDisplayed();
        return isVisible;
    }

    public void addNameEmail(String username, String mailid) {
        name.sendKeys(username);
        email.sendKeys(mailid);
    }

    public void addSubjectMessage(String sub, String mess) {
        subject.sendKeys(sub);
        message.sendKeys(mess);
    }

    public void chooseFile() {
        uploadFile.sendKeys("C:\\Users\\DELL 5430\\Desktop\\ghh.txt");
    }

    public void clickSubmitBtn() {
        submitBtn.click();
    }

    public void clickOk() {
        driver.switchTo().alert().accept();
    }

    public boolean setTextVisible1() {
        boolean isVisible = successMessage.isDisplayed();
        return isVisible;
    }
    public void clickHomeBtn() {
        homeBtn.click();
    }
    public boolean verifyNavigateToHomePage() {
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();
        return expectedUrl.equalsIgnoreCase(actualUrl);
        //assertEquals(expectedUrl, actualUrl);
    }
}
