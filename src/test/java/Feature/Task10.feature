@Task10
  Feature: Verify Subscription in home page

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Scroll down to footer
    Then User Verify text 'SUBSCRIPTION'
    When User Enter email address in input and click arrow button
    Then User Verify success message 'You have been successfully subscribed!' is visible