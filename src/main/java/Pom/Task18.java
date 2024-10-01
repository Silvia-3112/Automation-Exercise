package Pom;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task18 extends BaseClass {
    WebDriver driver;

    public Task18(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Category']")
    private WebElement textVisible;

    @FindBy(xpath = "//a[@href='#Women']")
    private WebElement womenBtn;

    @FindBy(xpath = "//a[text()='Saree ']")
    private WebElement sareeBtn;

    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement textVisible1;

    @FindBy(xpath = "//a[@href='#Men']")
    private WebElement menBtn;

    @FindBy(xpath = "//a[text()='Jeans ']")
    private WebElement jeansBtn;

    public boolean setCategoryVisible() {
        boolean isVisible1 = textVisible.isDisplayed();
        return isVisible1;
    }

    public void clickWomenBtn() throws InterruptedException {
        Thread.sleep(2000);
        womenBtn.click();
    }

    public void clickSareeBtn() throws InterruptedException {
        Thread.sleep(2000);
        sareeBtn.click();
    }

    public boolean verifyCategoryPageVisible() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "category_products";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public boolean setSareeProductsVisible() {
        boolean isVisible1 = textVisible1.isDisplayed();
        return isVisible1;
    }
    public void clickMenBtn() throws InterruptedException {
        Thread.sleep(2000);
        menBtn.click();
    }

    public void clickJeansBtn() throws InterruptedException {
        Thread.sleep(2000);
        jeansBtn.click();
    }
    public boolean verifyCategoryVisible() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "category_products";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
}
