package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Task14 extends BaseClass {
    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    public Task14(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        this.js= (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

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

    @FindBy(xpath = "//a//u[text()='View Cart']")
    private WebElement cartBtn;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    private WebElement checkOutBtn;

    @FindBy(xpath = "//a//u[text()='Register / Login']")
    private WebElement registerLoginBtn;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement signUpName;

    @FindBy(xpath = "//form[@action='/signup']//input[@placeholder='Email Address']")
    private WebElement email;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signUpBtn;

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement title;

    @FindBy(id = "name")
    private WebElement name1;

    @FindBy(id = "email")
    private WebElement email1;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement day;

    @FindBy(id = "months")
    private WebElement month;

    @FindBy(id = "years")
    private WebElement year;

    @FindBy(id = "newsletter")
    private WebElement checkBox1;

    @FindBy(id = "optin")
    private WebElement checkBox2;

    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "company")
    private WebElement companyName;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "address2")
    private WebElement address2;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zipcode")
    private WebElement zipCode;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountBtn;

    @FindBy(xpath = "//b[text()='Account Created!']")
    private WebElement accountCreatedText;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    private WebElement loggedInText;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement cart1Btn;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    private WebElement checkOut1Btn;

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

    @FindBy(xpath="//div[contains (text(),'placed successfully!')]")
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
    public void clickRegisterLoginBtn(){
        registerLoginBtn.click();
    }
    public void addNameEmailBtn(String username,String mailid) throws InterruptedException {
        Thread.sleep(3000);
        signUpName.sendKeys(username);
        email.sendKeys(mailid);
    }
    public void clickSignUpBtn(){
        signUpBtn.click();
    }
    public void clickTitleRadioBtn() {
        title.click();
    }

    public void addPassword(String pWord) {
        password.sendKeys(pWord);
    }

    public void selDay() {
        Select s = new Select(day);
        s.selectByVisibleText("31");
    }

    public void selMonth() {
        Select s = new Select(month);
        s.selectByVisibleText("December");
    }

    public void selYear() {
        Select s = new Select(year);
        s.selectByVisibleText("1984");
    }

    public void clickCheckBox1Btn() {
        checkBox1.click();
    }

    public void clickCheckBox2Btn() {
        checkBox2.click();
    }

    public void addFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void addLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void addCompany(String company) {
        companyName.sendKeys(company);
    }

    public void addAddress(String add1, String add2) {
        address1.sendKeys(add1);
        address2.sendKeys(add2);
    }

    public void selCountry() {
        Select s = new Select(country);
        s.selectByVisibleText("India");
    }

    public void addStateCity(String stat, String cit) {
        state.sendKeys(stat);
        city.sendKeys(cit);
    }

    public void addCodeMobile(String code, String num) {
        zipCode.sendKeys(code);
        mobileNumber.sendKeys(num);
    }

    public void clickCreateAccountBtn() {
        createAccountBtn.click();
    }
    public boolean setTextVisible2() {
        boolean isVisible = accountCreatedText.isDisplayed();
        return isVisible;
    }
    public void clickContinueBtn() {
        continueBtn.click();
    }
    public boolean setTextVisible3() {
        boolean isVisible = loggedInText.isDisplayed();
        return isVisible;
    }
    public void clickCart1Btn(){
        cart1Btn.click();
    }
    public void clickCheckOut1Btn(){
        checkOut1Btn.click();
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


