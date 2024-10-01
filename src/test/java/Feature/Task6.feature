@Task6
  Feature: Contact Us Form

    Scenario:
   Given User Launch the browser "Chrome"
    When User Navigate to url 'http://automationexercise.com'
    Then User Verify that home page is visible successfully
    When User Click on 'Contact Us' button
    Then User Verify 'GET IN TOUCH' is visible
    When User Enter name, email, subject and message
    And User Upload file
    And User Click 'Submit' button
    And User Click OK button
    Then User Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button and verify that landed to home page successfully
