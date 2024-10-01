@Task13
  Feature:Verify Product quantity in Cart

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click 'View Product' for any product on home page
    Then User Verify product detail is opened
    When User Increase quantity to 4
    And User Click 'Add to cart' button
    And User Click the 'View Cart' button
    Then User Verify that product is displayed in cart page with exact '4' quantity