@Task12
  Feature:  Add Products in Cart

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click on 'Products' button
    And User Hover over first product and click 'Add to cart'
    And User Click 'Continue Shopping' button
    And User Hover over second product and click 'Add to cart'
    And User Click on the 'View Cart' button
    Then User Verify both products are added to Cart
    And User Verify their prices, quantity and total price