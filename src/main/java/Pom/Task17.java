package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task17 extends BaseClass {
    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    public Task17(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        this.js= (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsBtn;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[11]")
    private WebElement firstProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[11]")
    private WebElement firstAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopping;

   // @FindBy(xpath = "//span[@id='gda']//*[name()='svg']")
   // private WebElement xMark;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[23]")
    private WebElement secondProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[23]")
    private WebElement secondAddToCart;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement cartBtn;

    @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
    private WebElement firstProdRemove;

    @FindBy(xpath = "//table[@id='cart_info_table']")
    private WebElement cartTable;



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
       // xMark.click();
        actions.moveToElement(secondProduct).build().perform();
    }
    public void clickOnSecondAddCart() throws InterruptedException {
        Thread.sleep(3000);
        secondAddToCart.click();
    }
    public void clickCartBtn(){
        cartBtn.click();
    }
    public boolean verifyCartPage(){
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "view_cart";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public void clickFirstProdToRemove(){
        //firstProdName= firstProduct.getText();
        firstProdRemove.click();
    }
    public boolean verifyFirstProdRemoved() throws InterruptedException {
        Thread.sleep(2000);
        return cartTable.getText().contains("Frozen Tops For Kids");
    }
}
