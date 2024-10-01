@Task14
  Feature:  Place Order: Register while Checkout

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Add products to cart
    And User Click 'Cart' button
    Then User Verify that cart page is displayed
    When User Click Proceed To Checkout
    And User Click that 'Register / Login' button
    And User Fill all details in Signup and create account
    Then User Verify 'ACCOUNT CREATED!' and click 'Continue' button
    And User Verify ' Logged in as username' at top
    When User Click the 'Cart' button
    And User Click on 'Proceed To Checkout' button
    Then User Verify Address Details and Review Your Order
    When User Enter description in comment text area and click 'Place Order'
    And User Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And User Click that the 'Pay and Confirm Order' button
    Then User Verify success message 'Your order has been placed successfully!'
    When User Click on the 'Delete Account' button
    Then User Verify the 'ACCOUNT DELETED!' and click 'Continue' button