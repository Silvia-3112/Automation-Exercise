package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task21 extends BaseClass {
    WebDriver driver;

    public Task21(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsBtn;

    @FindBy(xpath = "//a[@href='/product_details/19']")
    private WebElement viewProductBtn;

    @FindBy(xpath = "//a[text()='Write Your Review']")
    private WebElement textVisible;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "review")
    private WebElement review;

    @FindBy(xpath = "//button[@id='button-review']")
    private WebElement submitBtn;

    @FindBy(xpath = "//span[text()='Thank you for your review.']")
    private WebElement textVisible1;


    public void clickProductsBtn() {
        productsBtn.click();
    }

    public boolean verifyNavigateAllProductsPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "products";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public void clickViewProductBtn() {
        viewProductBtn.click();
    }
    public boolean verifyWriteReviewVisible(){
        boolean isVisible=textVisible.isDisplayed();
        return isVisible;
    }
    public void addNameMailReview(String username,String mailid,String feedback){
        name.sendKeys(username);
        email.sendKeys(mailid);
        review.sendKeys(feedback);
    }
    public void clickSubmitBtn() {
        submitBtn.click();
    }
    public boolean verifyThankyouMessageVisible(){
        boolean isVisible=textVisible1.isDisplayed();
        return isVisible;
    }
}
