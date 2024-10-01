@Task8
  Feature: Verify All Products and product detail page

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click on 'Products' button
    Then User  Verify user is navigated to ALL PRODUCTS page successfully
    And User verify The products list is visible
    When User Click on 'View Product' of first product
    Then User is landed to product detail page
    And User Verify that  detail is visible: product name, category, price, availability, condition, brand