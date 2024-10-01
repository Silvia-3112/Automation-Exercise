package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task9 extends BaseClass {
    WebDriver driver;

    public Task9(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsBtn;

    @FindBy(id = "search_product")
    private WebElement enterSearchBox;

    @FindBy(id = "submit_search")
    private WebElement searchBtn;

    @FindBy(xpath = "//h2[text()='Searched Products']")
    private WebElement textVisible;

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement allSearchProd;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }

    public void clickProductsBtn() {
        productsBtn.click();
    }

    public boolean verifyNavigateAllProductsPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "products";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }

    public void enterProdNameInSearchBox(String prodName) {
        enterSearchBox.sendKeys(prodName);
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public boolean setTextVisible() {
        return textVisible.isDisplayed();
    }

    public boolean visibleAllSearchProd() {
        return allSearchProd.isDisplayed();
    }
}