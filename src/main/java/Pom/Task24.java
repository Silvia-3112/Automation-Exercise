package Pom;

import Base.BaseClass;
import Base.MyData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class Task24 extends BaseClass {
    WebDriver driver;
    JavascriptExecutor js;
    Actions actions;

    public Task24(WebDriver driver){
        this.driver=driver;
        actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='header-middle']//ancestor::body")
    private WebElement homePage;

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    private WebElement productsBtn;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[1]")
    private WebElement firstProd;

    @FindBy(xpath = "(//div[@class='overlay-content']//a[text()='Add to cart'])[1]")
    private WebElement firstOverlayAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShopping;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement cartBtn;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//a[@href='/login']//u")
    private WebElement regOrLogin;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement email;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signUpBtn;

    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement genderTitle;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passField;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement dayB;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement monthB;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement yearB;

    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement newsLetter;

    @FindBy(xpath = "//input[@id='optin']")
    private WebElement splOffer;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement companyName;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    private WebElement address2;

    @FindBy(xpath = "//input[@id='state']")
    private WebElement stateName;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityName;

    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    private WebElement mobNumber;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccBtn;

    @FindBy(xpath = "//b[text()='Account Created!']")
    private WebElement accCreated;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    private WebElement loggedInAs;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement cart1Btn;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    private WebElement proceedToCheckout1;

    @FindBy(xpath = "//h2[text()='Address Details']")
    private WebElement accDetailTxt;

    @FindBy(xpath = "//h2[text()='Review Your Order']")
    private WebElement reviewUrOrder;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement description;

    @FindBy(xpath = "//a[text()='Place Order']")
    private WebElement placeOrderBtn;

    @FindBy(xpath = "//input[@name='name_on_card']")
    private WebElement nameOnCard;

    @FindBy(xpath = "//input[@name='card_number']")
    private WebElement cardNum;

    @FindBy(xpath = "//input[@name='cvc']")
    private WebElement cvc;

    @FindBy(xpath = "//input[@name='expiry_month']")
    private WebElement expMonth;

    @FindBy(xpath = "//input[@name='expiry_year']")
    private WebElement expYear;

    @FindBy(xpath = "//button[@data-qa='pay-button']")
    private WebElement payBtn;

    @FindBy(xpath = "//p[contains(text(),'Your order')]")
    private WebElement successTxt;

    @FindBy(xpath = "//a[text()='Download Invoice']")
    private WebElement downloadInvoice;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continue1Btn;

    @FindBy(xpath = "//a[contains(text(),'Delete Account')]")
    private WebElement deleteAccount;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    private WebElement accountDeleted;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement accDelContinueBtn;

    public boolean visibleHomePage(){
        return homePage.isDisplayed();
    }
    public void clickOnProductsBtn(){
        productsBtn.click();
    }
    public void mouseHoverToFirstProd(){
        actions.moveToElement(firstProd).build().perform();
    }
    public void clickOnOverlayFirstAddCart(){
        //firstOverlayAddToCart.click();
        js.executeScript("arguments[0].click();", firstOverlayAddToCart);
    }
    public void clickOnOverlayContinue(){
        continueShopping.click();
    }
    public void clickOnCartBtn(){
        cartBtn.click();
    }
    public boolean verifyPage(){
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "view_cart";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
    public void clickOnProceedToCheckout(){
        proceedToCheckout.click();
    }
    public void clickOnRegOrLogin(){
        regOrLogin.click();
    }
    public void addNameAndEmail(){
        userName.sendKeys(MyData.userName);
        email.sendKeys(MyData.email);
    }
    public void clickOnSignUp(){
        signUpBtn.click();
    }
    public void addAccInfo(){
        genderTitle.click();
        passField.sendKeys(MyData.correctPassword);
        Select s1 = new Select(dayB);
        s1.selectByVisibleText(MyData.day);
        Select s2 = new Select(monthB);
        s2.selectByVisibleText(MyData.month);
        Select s3 = new Select(yearB);
        s3.selectByVisibleText(MyData.year);
    }
    public void clickOnSplOffer(){
        splOffer.click();
    }
    public void clickOnNewsLetter(){
        newsLetter.click();
    }
    public void addAddressInfo(){
        firstName.sendKeys(MyData.fName);
        lastName.sendKeys(MyData.lName);
        companyName.sendKeys((MyData.companyName));
        address1.sendKeys(MyData.addressArea);
        address2.sendKeys(MyData.addressArea2);
        stateName.sendKeys(MyData.state);
        cityName.sendKeys(MyData.city);
        zipCode.sendKeys(MyData.zip);
        mobNumber.sendKeys(MyData.mobileNumber);
    }
    public void clickOnCreateAccBtn(){
        createAccBtn.click();
    }
    public boolean visibleAccCreated(){
        return accCreated.isDisplayed();
    }
    public void clickOnContinue(){
        continueBtn.click();
    }
    public boolean visibleLoggedInAs(){
        return loggedInAs.isDisplayed();
    }
    public void clickOnCart1Btn(){
        cart1Btn.click();
    }
    public void clickOnProceedToCheckout1(){
        proceedToCheckout1.click();
    }
    public boolean getAccDetailTxt(){
        boolean isVisible = accDetailTxt.isDisplayed();
        return isVisible;
    }
    public boolean getReviewUrOrderTxt(){
        boolean isVisible = reviewUrOrder.isDisplayed();
        return isVisible;
    }
    public void addMessageInDescription(String msg){
        description.sendKeys(msg);
    }
    public void clickOnPlaceOrder(){
        placeOrderBtn.click();
    }
    public void addCardDetail(String cardName,String cardNumber, String cardCVV, String month, String yr){
        nameOnCard.sendKeys(cardName);
        cardNum.sendKeys(cardNumber);
        cvc.sendKeys(cardCVV);
        expMonth.sendKeys(month);
        expYear.sendKeys(yr);
    }
    public void clickOnPayBtn(){
        payBtn.click();
    }
    public boolean verifySuccessAlert(){
        boolean isVisible = successTxt.isDisplayed();
        return isVisible;
    }
    public void clickOnDownloadInvoice(){
        downloadInvoice.click();
    }
    public boolean verifyInvoiceDownloaded() throws InterruptedException {

        Thread.sleep(3000);
        String downloadFilePath = "C:\\Users\\hp\\Downloads";
        File downloadedFile = new File(downloadFilePath + "\\invoice.txt");

        boolean fileDownloaded;
        if (downloadedFile.exists()) {
            fileDownloaded = true;
        } else {
            fileDownloaded = false;
        }
        return fileDownloaded;
    }
    public void clickOnContBtn(){
        continue1Btn.click();
    }
    public void clickOnAccDelete(){
        deleteAccount.click();
    }
    public boolean visibleAccDeleted(){
        return accountDeleted.isDisplayed();
    }
    public void clickOnAccDelContinue(){
        accDelContinueBtn.click();
    }
}
