package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task19 extends BaseClass {
    WebDriver driver;

    public Task19(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[text()=' Products']")
    private WebElement productsBtn;

    @FindBy(xpath=" //h2[text()='Brands']")
    private WebElement textVisible;

    @FindBy(xpath="//a[text()='Allen Solly Junior']")
    private WebElement brandName1Btn;

    @FindBy(xpath="//h2[@class='title text-center']")
    private WebElement textVisible1;

    @FindBy(xpath="//a[text()='Babyhug']")
    private WebElement brandName2Btn;

    @FindBy(xpath="//h2[@class='title text-center']")
    private WebElement textVisible2;

    public void clickProductsBtn() {
        productsBtn.click();
    }
    public boolean verifyBrandsVisible() {
            return textVisible.isDisplayed();
        }
    public void clickBrandName1Btn() {
        brandName1Btn.click();
    }
    public boolean verifyNavigateBrandPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "brand_products";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public boolean verifyBrandsProductsVisible() {
        return textVisible1.isDisplayed();
    }
    public void clickBrandName2Btn() {
        brandName2Btn.click();
    }
    public boolean verifyNavigateToBrandPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "brand_products";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public boolean verifyBabyHugProductsVisible() {
        return textVisible2.isDisplayed();
    }
}
