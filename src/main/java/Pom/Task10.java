package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task10 extends BaseClass {
    WebDriver driver;
    JavascriptExecutor js;

    public Task10(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//footer[@id='footer']")
    private WebElement footer;

    @FindBy(xpath = "//h2[text()='Subscription']")
    private WebElement subscription;

    @FindBy(id = "susbscribe_email")
    private WebElement email;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    private WebElement arrowBtn;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    private WebElement successMsg;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }

    public void scrollToFooter(){
        js.executeScript("arguments[0].scrollIntoView(true)", footer);
    }
    public boolean setTextVisible(){
        return subscription.isDisplayed();
    }
    public void addEmail(String mailid){
        email.sendKeys(mailid);
    }
    public void clickArrowBtn(){
        arrowBtn.click();
    }
    public boolean verifySuccessfulMsg(String successTxt){
        String s = successMsg.getText();
        return s.contains(successTxt);
    }

}
