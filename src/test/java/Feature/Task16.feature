@Task16
  Feature: Place Order: Login before Checkout

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click 'Signup / Login' button
    And User Fill email, password and click 'Login' button
    Then User Verify 'Logged in as username' at top
    When User Add products to cart
    And User Click the 'Cart' button
    Then User Verify that cart page is displayed
    When User Click Proceed To Checkout
    Then User Verify Address Details and Review Your Order
    When User Enter description in comment text area and click 'Place Order'
    And User Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And User Click on 'Pay and Confirm Order' button
    Then User Verify success message 'Your order has been placed successfully!'
    When User Click on the 'Delete Account' button
    Then User Verify 'ACCOUNT DELETED!' and click the 'Continue' button