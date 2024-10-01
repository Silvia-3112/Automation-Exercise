@Task26
  Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Scroll down page to bottom
    Then User Verify 'SUBSCRIPTION' is visible
    When User Scroll up page to top
    Then User Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen