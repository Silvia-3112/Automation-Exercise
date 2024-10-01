package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task20 extends BaseClass {
    WebDriver driver;
    JavascriptExecutor js;
    Actions actions;

    public Task20(WebDriver driver) {
        actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopping1;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[3]")
    private WebElement thirdProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[3]")
    private WebElement thirdAddToCart;

    @FindBy(xpath = "//u[text()='View Cart']")
    private WebElement cartBtn;

    @FindBy(xpath = "(//td[@class='cart_description']//h4)[1]")
    private WebElement firstProdName;

    @FindBy(xpath = "(//td[@class='cart_description']//h4)[2]")
    private WebElement secondProdName;

    @FindBy(xpath = "(//td[@class='cart_description']//h4)[3]")
    private WebElement thirdProdName;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement signUpLoginBtn;

    @FindBy(xpath = "//form[@action='/login']//input[@placeholder='Email Address']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement login;

    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    private WebElement cart1Btn;

    @FindBy(xpath = "(//td[@class='cart_description']//h4)[1]")
    private WebElement firstProd;



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

    public void mouseHoverToFirstProd() {
        actions.moveToElement(firstProduct).build().perform();
    }

    public void clickOnFirstAddCart() {
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

    public void clickOnContinue1() throws InterruptedException {
        Thread.sleep(3000);
        continueShopping1.click();
    }

    public void mouseHoverToThirdProd() throws InterruptedException {
        Thread.sleep(3000);
        actions.moveToElement(thirdProduct).build().perform();
    }

    public void clickOnThirdAddCart() throws InterruptedException {
        Thread.sleep(3000);
        thirdAddToCart.click();
    }

    public void clickOnCart() throws InterruptedException {
        Thread.sleep(3000);
        cartBtn.click();
    }

    public static String firstProductName;
    public static String secondProductName;
    public static String thirdProductName;

    public boolean setFirstProduct() {
        boolean isVisible = firstProdName.isDisplayed();
        return isVisible;
    }
        public boolean setSecondProduct(){
        return secondProdName.isDisplayed();
    }
    public boolean setThirdProduct(){
        return thirdProdName.isDisplayed();
    }

    public void clickSignUpBtn() throws InterruptedException {
        Thread.sleep(2000);
        signUpLoginBtn.click();
    }

    public void addEmailPassword(String emailid, String pword) {
        email.sendKeys(emailid);
        password.sendKeys(pword);
    }

    public void clickLoginBtn() {
        login.click();
    }
    public void clickOnCart1() throws InterruptedException {
        Thread.sleep(3000);
        cart1Btn.click();
    }
    public static String firstProduct1;
    public boolean verifyFirstProduct() throws InterruptedException {
        Thread.sleep(3000);
        boolean isVisible = firstProd.isDisplayed();
        return isVisible;
    }

}