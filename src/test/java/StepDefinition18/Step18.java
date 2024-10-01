package StepDefinition18;

import Base.BaseClass;
import Pom.Task18;
import Pom.Task4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step18 extends BaseClass {
    Task18 task18;

    @Given("User Launch the browser {string}")
    public void userLaunchTheBrowser(String browser) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.implicitlyWait();
        task18 = new Task18(driver);
    }
    @When("User Navigate to url {string}")
    public void userNavigateToUrl(String link) {
        BaseClass.launchURL(link);
    }
    @Then("User Verify that categories are visible on left side bar")
    public void userVerifyThatCategoriesAreVisibleOnLeftSideBar() {
    Assert.assertTrue(task18.setCategoryVisible());
    }
    @When("User Click on {string} category")
    public void userClickOnCategory(String women) throws InterruptedException {
    task18.clickWomenBtn();
    }
    @When("User Click on any category link under {string} category, for example: Dress")
    public void userClickOnAnyCategoryLinkUnderCategoryForExampleDress(String saree) throws InterruptedException {
        task18.clickSareeBtn();
    }
    @Then("User Verify that category page is displayed and confirm text {string}")
    public void userVerifyThatCategoryPageIsDisplayedAndConfirmText(String category) {
    Assert.assertTrue(task18.verifyCategoryPageVisible());
        Assert.assertTrue(task18.setSareeProductsVisible());
    }
    @When("User On left side bar, click on any sub-category link of {string} category")
    public void userOnLeftSideBarClickOnAnySubCategoryLinkOfCategory(String men) throws InterruptedException {
        task18.clickMenBtn();
        task18.clickJeansBtn();
    }
    @Then("User Verify that user is navigated to that category page")
    public void userVerifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertTrue(task18.verifyCategoryVisible());
    }

}
