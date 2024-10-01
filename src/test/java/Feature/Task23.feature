@Task23
  Feature: Verify address details in checkout page

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click 'Signup / Login' button
    And User Fill all details in Signup and create account
    Then User Verify 'ACCOUNT CREATED!' and click 'Continue' button
    And User Verify ' Logged in as username' at top
    When User Add products to cart
    And User Click on 'Cart' button
    Then User Verify that cart page is displayed
    When User Click Proceed To Checkout
    Then User Verify that the delivery address is same address filled at the time registration of account
    And User Verify that the billing address is same address filled at the time registration of account
    When User Click on the 'Delete Account' button
    Then User Verify 'ACCOUNT DELETED!' and click on 'Continue' button