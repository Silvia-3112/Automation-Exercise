@Task5
  Feature: Register User with existing email

    Scenario:
    Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click on 'Signup / Login' button
    Then User Verify 'New User Signup!' is visible
    When User Enter name and already registered email address
    And User Click 'Signup' button
    Then User Verify error 'Email Address already exist!' is visible