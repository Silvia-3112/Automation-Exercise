package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task7 extends BaseClass {
    WebDriver driver;

    public Task7(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "(//a[@class='test_cases_list']//button[text()='Test Cases'])[1]")
    private WebElement testCasesBtn;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }
    public void clickTestCasesBtn() throws InterruptedException {
        Thread.sleep(2000);
        testCasesBtn.click();
    }
    public boolean verifyNavigateToTestCasesPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "test_cases";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
}
