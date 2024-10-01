@Task18
  Feature: View Category Products

    Scenario:

    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that categories are visible on left side bar
    When User Click on 'Women' category
    And User Click on any category link under 'Women' category, for example: Dress
    Then User Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    When User On left side bar, click on any sub-category link of 'Men' category
    Then User Verify that user is navigated to that category page