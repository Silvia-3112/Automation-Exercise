@Task4
Feature: Logout User

  Scenario:
  Given User Launch the browser "Chrome"
  When User Navigate to url 'http://automationexercise.com'
  Then User Verify that home page is visible successfully
  When User Click on 'Signup / Login' button
  Then User Verify 'Login to your account' is visible
  When User Enter correct email address and password
  And User Click the 'login' button
  Then User Verify that 'Logged in as username' is visible
  When User Click 'Logout' button
  Then Verify that user is navigated to login page