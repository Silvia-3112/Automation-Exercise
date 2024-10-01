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

public class Task23 extends BaseClass {
    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    public Task23(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        this.js= (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement signUpLoginBtn;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    private WebElement textVisible;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement name;

    @FindBy(xpath = "//form[@action='/signup']//input[@placeholder='Email Address']")
    private WebElement email;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signup;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement textVisible1;

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

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_firstname address_lastname']")
    private WebElement delName;

    @FindBy(xpath = "(//ul[@id='address_delivery']//li[@class='address_address1 address_address2'])[2]")
    private WebElement delAddress1;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode']")
    private WebElement delAddress2;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_phone']")
    private WebElement delMobNum;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_firstname address_lastname']")
    private WebElement billName;

    @FindBy(xpath = "(//ul[@id='address_invoice']//li[@class='address_address1 address_address2'])[2]")
    private WebElement billAddress1;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode']")
    private WebElement billAddress2;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_phone']")
    private WebElement billMobNum;

    @FindBy(xpath = "//a[@href='/delete_account']")
    private WebElement delAccBtn;

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

    public void addNameEmail(String username, String emailid) {
        name.sendKeys(username);
        email.sendKeys(emailid);
    }

    public void clickSignupBtn() {
        signup.click();
    }

    public boolean setTextVisible1() {
        boolean isVisible = textVisible1.isDisplayed();
        return isVisible;
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
    public boolean verifyDeliveryAddress() {
        boolean firstName = delName.getText().contains(MyData.fName);
        boolean lastname = delName.getText().contains(MyData.lName);
        boolean address1 = delAddress1.getText().contains(MyData.addressArea);
        boolean address2 = delAddress2.getText().contains(MyData.city);
        boolean mobileNumber = delMobNum.getText().contains(MyData.mobileNumber);

        System.out.println(firstName);
        System.out.println(lastname);
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(mobileNumber);
        System.out.println(delAddress1.getText());
        System.out.println(MyData.addressArea);


        return firstName && lastname && address1 && address2 && mobileNumber;
    }
    public boolean verifyBillingAddress() {
        boolean firstName = billName.getText().contains(MyData.fName);
        boolean lastname = billName.getText().contains(MyData.lName);
        boolean address1 = billAddress1.getText().contains(MyData.addressArea);
        boolean address2 = billAddress2.getText().contains(MyData.city);
        boolean mobileNumber = billMobNum.getText().contains(MyData.mobileNumber);

        return firstName && lastname && address1 && address2 && mobileNumber;
    }
    public void clickOnDelAccBtn(){
        delAccBtn.click();
    }
    public boolean setTextVisible5() {
        boolean isVisible = accountDeletedText.isDisplayed();
        return isVisible;
    }
    public void clickContBtn() {
        contBtn.click();
    }
}



