@Task3
Feature:Login User with incorrect email and password

  Scenario:
 Given User Launch the browser "Chrome"
  When User Navigate to url 'http://automationexercise.com'
  Then User Verify that home page is visible successfully
  When User Click on 'Signup / Login' button
  Then User Verify 'Login to your account' is visible
  When User Enter incorrect email address and password
  And User Click 'login' button
  Then User Verify error 'Your email or password is incorrect!' is visible