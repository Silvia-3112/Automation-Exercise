package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task8 extends BaseClass {
    WebDriver driver;

    public Task8(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsBtn;

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement productsListVisible;

    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    private WebElement firstViewProduct;

    @FindBy(xpath = "//h2[text()='Blue Top']")
    private WebElement productNameVisible;

    @FindBy(xpath = "//p[contains(text(),'Category')]")
    private WebElement categoryVisible;

    @FindBy(xpath = "//label[text()='Quantity:']//preceding-sibling::span")
    private WebElement priceVisible;

    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    private WebElement availabilityVisible;

    @FindBy(xpath = "//b[contains(text(),'Condition:')]")
    private WebElement conditionVisible;

    @FindBy(xpath = "//b[contains(text(),'Brand:')]")
    private WebElement brandVisible;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }
    public void clickProductsBtn(){
        productsBtn.click();
    }
    public boolean verifyNavigateAllProductsPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "products";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public boolean visibleAllProducts(){
        return productsListVisible.isDisplayed();
    }
    public void clickFirstViewProductsBtn(){
        firstViewProduct.click();
    }
    public boolean verifyNavigateProductDetailsPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "product_details";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public boolean verifyProductNameVisible() {
        return productNameVisible.isDisplayed();
    }
        public boolean verifyCategoryVisible() {
            return categoryVisible.isDisplayed();
        }
            public boolean verifyPriceVisible() {
                return priceVisible.isDisplayed();
            }
                public boolean verifyAvailabilityVisible() {
                    return availabilityVisible.isDisplayed();
                }
    public boolean verifyConditionVisible() {
        return conditionVisible.isDisplayed();
    }
    public boolean verifyBrandVisible(){
        return brandVisible.isDisplayed();
    }
}
