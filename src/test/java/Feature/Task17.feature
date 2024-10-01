@Task17
  Feature: Remove Products From Cart

    Scenario:
    Given User Launch the browser "Chrome" browser
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Add products to cart
    And User Click 'Cart' button
    Then User Verify that cart page is displayed
    When User Click 'X' button corresponding to particular product
    Then User Verify that product is removed from the cart