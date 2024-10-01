@Task20
  Feature: Search Products and Verify Cart After Login

    Scenario:
   Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    And User Click on 'Products' button
    Then User Verify user is navigated to ALL PRODUCTS page successfully
    When User Enter product name in search input and click search button
    Then User Verify 'SEARCHED PRODUCTS' is visible
    And User Verify all the products related to search are visible
    When User Add those products to cart
    And User Click 'Cart' button and verify that products are visible in cart
    And User Click 'Signup / Login' button and submit login details
    Then User Again, go to Cart page
    And User Verify that those products are visible in cart after login as well