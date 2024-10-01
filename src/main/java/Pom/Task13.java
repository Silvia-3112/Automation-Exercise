package Pom;

import Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task13 extends BaseClass {
    WebDriver driver;
    JavascriptExecutor js;

    public Task13(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//html[@lang='en']")
    private WebElement homePage;

    @FindBy(xpath = "//ul[@class='nav nav-pills nav-justified']//a[@href='/product_details/4']")
    private WebElement viewProductBtn;

    @FindBy(id= "quantity")
    private WebElement productQty;

    @FindBy(xpath="//button[@class='btn btn-default cart']")
    private WebElement addCartBtn;

    @FindBy(xpath="//u[text()='View Cart']")
    private WebElement viewCartBtn;

    @FindBy(xpath = "//td[@class='cart_quantity']//button")
    private WebElement prodQty;

    public boolean setHomePage() {
        boolean isVisible = homePage.isDisplayed();
        return isVisible;
    }

    public void clickViewProductBtn() {
        viewProductBtn.click();
    }
    public boolean verifyProductDetailPage() {
        String currentUrl = driver.getCurrentUrl();
        String wordToCheck = "product_details";
        boolean isWordInUrl = currentUrl.contains(wordToCheck);
        return isWordInUrl;
    }
            public void productIncQty(){
            productQty.clear();
            productQty.sendKeys("4");
        }
        public void clickAddCartBtn(){
        addCartBtn.click();
        }
    public void clickViewCartBtn(){
        viewCartBtn.click();
    }
    public boolean verifyProdQty(String qty){
        String txt = prodQty.getText();
        return txt.equals(qty);
    }
}
