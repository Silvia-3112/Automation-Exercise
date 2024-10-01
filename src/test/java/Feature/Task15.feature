@Task15
  Feature: Place Order: Register before Checkout

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click 'Signup / Login' button
    And User Fill all details in Signup and create account
    Then User Verify 'ACCOUNT CREATED!' and click 'Continue' button
    And User Verify ' Logged in as username' at top
    And User Add products to cart
    And User Click on 'Cart' button
    Then User Verify that cart page is displayed
    When User Click the 'Proceed To Checkout' button
    Then User Verify Address Details and Review Your Order
    When User Enter description in comment text area and click 'Place Order'
    And User Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And User Click on the 'Pay and Confirm Order' button
    Then User Verify success message 'Your order has been placed successfully!'
    When User Click the btn 'Delete Account'
    Then User Verify 'ACCOUNT DELETED!' and click the 'Continue' button