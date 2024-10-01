@Task21
  Feature:

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    And User Click on 'Products' button
    Then User Verify user is navigated to ALL PRODUCTS page successfully
    When User Click on the 'View Product' button
    Then User Verify 'Write Your Review' is visible
    When User Enter name, email and review
    And User Click 'Submit' button
    Then User Verify success message 'Thank you for your review.'