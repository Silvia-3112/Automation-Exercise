package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task12 extends BaseClass {
    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    public Task12(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        this.js= (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsBtn;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[1]")
    private WebElement firstProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[1]")
    private WebElement firstAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopping;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[2]")
    private WebElement secondProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[2]")
    private WebElement secondAddToCart;

    @FindBy(xpath = "//u[text()='View Cart']")
    private WebElement cartBtn;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    private WebElement firstProdName;

    @FindBy(xpath = "//a[@href='/product_details/2']")
    private WebElement secondProdName;

    @FindBy(xpath = "(//td[@class='cart_price']//p)[1]")
    private WebElement firstProdPrice;

    @FindBy(xpath = "(//td[@class='cart_price']//p)[2]")
    private WebElement secondProdPrice;

    @FindBy(xpath = "(//td[@class='cart_quantity']//button)[1]")
    private WebElement firstProdQty;

    @FindBy(xpath = "(//td[@class='cart_quantity']//button)[2]")
    private WebElement secondProdQty;

    @FindBy(xpath = "(//td[@class='cart_total']//p)[1]")
    private WebElement firstProdTotalPrice;

    @FindBy(xpath = "(//td[@class='cart_total']//p)[2]")
    private WebElement secondProdTotalPrice;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }
    public void clickProductsBtn() {
        productsBtn.click();
    }
    public void mouseHoverToFirstProd(){
        actions.moveToElement(firstProduct).build().perform();
    }
    public void clickOnFirstAddCart(){
        js.executeScript("arguments[0].click();", firstAddToCart);
    }
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(3000);
        continueShopping.click();
    }
    public void mouseHoverToSecondProd() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(secondProduct).build().perform();
    }
    public void clickOnSecondAddCart() throws InterruptedException {
        Thread.sleep(3000);
        secondAddToCart.click();
    }

    public void clickOnCart() throws InterruptedException {
        Thread.sleep(3000);
        cartBtn.click();
    }
    public static String firstProductName = "Blue Top";
    public boolean verifyFirstProd() throws InterruptedException {
        Thread.sleep(3000);
        String s = firstProdName.getText();
        return s.equalsIgnoreCase(firstProductName);
    }
    public static String secondProductName="Men Tshirt";
    public boolean verifySecondProd() throws InterruptedException {
        Thread.sleep(3000);
        String s = secondProdName.getText();
        return s.equalsIgnoreCase(secondProductName);

    }
    public boolean verifyFirstProdPrice(){
        return firstProdPrice.isDisplayed();
    }
    public boolean verifySecondProdPrice(){
        return secondProdPrice.isDisplayed();
    }
    public boolean verifyFirstProdQty(){
        return firstProdQty.isDisplayed();
    }
    public boolean verifySecondProdQty(){
        return secondProdQty.isDisplayed();
    }
    public boolean verifyFirstProdTotalPrice(){
        return firstProdTotalPrice.isDisplayed();
    }
    public boolean verifySecondProdTotalPrice(){
        return secondProdTotalPrice.isDisplayed();
    }
}
