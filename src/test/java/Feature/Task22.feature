@Task22
  Feature: Add to cart from Recommended items

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    And User Scroll to bottom of page
    Then User Verify 'RECOMMENDED ITEMS' are visible
    When User Click on 'Add To Cart' on Recommended product
    And User Click on 'View Cart' button
    Then User Verify that product is displayed in cart page