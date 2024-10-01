package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task25 extends BaseClass {
    WebDriver driver;
    JavascriptExecutor js;

    public Task25(WebDriver driver) {
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

    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    private WebElement scrollUpArrow;

    @FindBy(xpath = "(//h2[contains(text(),'Full-Fledged')])[1]")
    private WebElement fullPledgedHeading;

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
    public void clickOnScrollUpArrow(){
        scrollUpArrow.click();
    }
    public boolean verifyPageIsFullyScrolledUp() throws InterruptedException {
        Thread.sleep(2000);
        boolean scrolledUp;
        Long scrollPosition = (Long) js.executeScript("return window.scrollY;");
        scrolledUp = scrollPosition == 0;
        return scrolledUp;
    }
    public boolean verifyFullPledged(){
        return fullPledgedHeading.isDisplayed();
    }
}


