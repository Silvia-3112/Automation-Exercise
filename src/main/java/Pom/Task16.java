package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task16 extends BaseClass {
    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    public Task16(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        this.js= (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement signUpLoginBtn;

    @FindBy(xpath = "//form[@action='/login']//input[@placeholder='Email Address']")
    private WebElement email;

    @FindBy(xpath= "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement login;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    private WebElement textVisible1;

    @FindBy(xpath = "//a[text()=' Products']")
    private WebElement productsBtn;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[9]")
    private WebElement firstProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[9]")
    private WebElement firstAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopping;

    // @FindBy(xpath = "//span[@id='gda']//*[name()='svg']")
    // private WebElement xMark;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[19]")
    private WebElement secondProduct;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[19]")
    private WebElement secondAddToCart;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement cartBtn;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    private WebElement checkOutBtn;

    @FindBy(xpath = "//h2[text()='Address Details']")
    private WebElement addressDetailText;

    @FindBy(xpath = "//h2[text()='Review Your Order']")
    private WebElement reviewUrOrder;

    @FindBy(xpath="//textarea[@class='form-control']")
    private WebElement commentArea;

    @FindBy(xpath="//a[text()='Place Order']")
    private WebElement placeOrderBtn;

    @FindBy(xpath="//input[@data-qa='name-on-card']")
    private WebElement nameOnCard;

    @FindBy(xpath="//input[@data-qa='card-number']")
    private WebElement cardNumber;

    @FindBy(xpath="//input[@data-qa='cvc']")
    private WebElement cvc;

    @FindBy(xpath="//input[@data-qa='expiry-month']")
    private WebElement expiryMonth;

    @FindBy(xpath="//input[@data-qa='expiry-year']")
    private WebElement expiryYear;

    @FindBy(xpath="//button[text()='Pay and Confirm Order']")
    private WebElement payAndConfirmOrderBtn;

    @FindBy(xpath="//p[contains(text(),'Your order')]")
    private WebElement successMessageText;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    private WebElement deleteAccountBtn;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeletedText;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement contBtn;


    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
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
    public boolean setTextVisible1() {
        boolean isVisible2 = textVisible1.isDisplayed();
        return isVisible2;
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
    public void clickCheckOutBtn(){
        checkOutBtn.click();
    }
    public boolean getAddressDetailTxt(){
        boolean isVisible=addressDetailText.isDisplayed();
        return isVisible;
    }
    public boolean getReviewUrOrderTxt(){
        boolean isVisible=reviewUrOrder.isDisplayed();
        return isVisible;
    }
    public void addComment(String comment) {
        commentArea.sendKeys(comment);
    }
    public void clickPlaceOrderBtn(){
        placeOrderBtn.click();
    }
    public void addNameOnCard(String cardName) {
        nameOnCard.sendKeys(cardName);
    }
    public void addCardNumber(String cardNum) {
        cardNumber.sendKeys(cardNum);
    }
    public void addCvc(String cvcNum) {
        cvc.sendKeys(cvcNum);
    }
    public void addExpiryMonth(String month) {
        expiryMonth.sendKeys(month);
    }
    public void addExpiryYear(String year) {
        expiryYear.sendKeys(year);
    }
    public void clickPayAndConfirmOrderBtn(){
        payAndConfirmOrderBtn.click();
    }
    public boolean setTextVisible4() {
        boolean isVisible = successMessageText.isDisplayed();
        return isVisible;
    }
    public void clickDeleteAccountBtn() {
        deleteAccountBtn.click();
    }
    public boolean setTextVisible5() {
        boolean isVisible = accountDeletedText.isDisplayed();
        return isVisible;
    }
    public void clickContBtn() {
        contBtn.click();
    }
}
