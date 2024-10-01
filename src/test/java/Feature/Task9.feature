@Task9
  Feature: Search Product

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click on 'Products' button
    Then User  Verify user is navigated to ALL PRODUCTS page successfully
    When User Enter product name in search input and click search button
    Then User Verify 'SEARCHED PRODUCTS' is visible
    And User Verify all the products related to search are visible