package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task22 extends BaseClass {
    WebDriver driver;
    JavascriptExecutor js;
    Actions actions;

    public Task22(WebDriver driver){
        this.driver=driver;
        actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//footer[@id='footer']")
    private WebElement footer;

    @FindBy(xpath = "//h2[text()='recommended items']")
    private WebElement recommendedItems;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[6]")
    private WebElement firstProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[6]")
    private WebElement firstAddToCart;

    @FindBy(xpath = "//u[text()='View Cart']")
    private WebElement cartBtn;

    public void scrollToFooter(){
        js.executeScript("arguments[0].scrollIntoView(true)", footer);
    }
    public boolean setRecommendedItems() {
        boolean isVisible = recommendedItems.isDisplayed();
        return isVisible;
    }
    public void mouseHoverToFirstProd() {
        actions.moveToElement(firstProduct).build().perform();
    }

    public void clickOnFirstAddCart() {
        js.executeScript("arguments[0].click();", firstAddToCart);
    }
    public void clickOnCart() throws InterruptedException {
        Thread.sleep(3000);
        cartBtn.click();
    }
    public boolean verifyCartPage(){
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "view_cart";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }

}
