@Task2
Feature:  Login User with correct email and password

  Scenario:
  Given User Launch the browser "Chrome"
When User Navigate to url 'http://automationexercise.com'
Then User Verify that home page is visible successfully
When User Click on 'Signup / Login' button
Then User Verify 'Login to your account' is visible
When User Enter correct email address and password
And User Click the 'login' button
Then User Verify that 'Logged in as username' is visible
When User Click 'Delete Account' button
Then User  Verify that the text 'ACCOUNT DELETED!' is visible