@Task19
  Feature: View & Cart Brand Products

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    When User Click on 'Products' button
    Then User Verify that Brands are visible on left side bar
    When User Click on any brand name
    Then User Verify that user is navigated to brand page and brand products are displayed
    When User On left side bar, click on any other brand link
    Then User Verify that user is navigated to that brand page and can see products