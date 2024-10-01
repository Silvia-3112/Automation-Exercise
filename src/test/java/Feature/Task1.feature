@Task1
Feature: Register User

  Scenario:
    Given User Launch the browser "Chrome"
  When User Navigate to url 'http://automationexercise.com'
  Then User Verify that home page is visible successfully
  When User Click on 'Signup / Login' button
  Then User Verify 'New User Signup!' is visible
  When User Enter the  name and email address
  And User Click the 'Signup' button
  Then User Verify that the text 'ENTER ACCOUNT INFORMATION' is visible
  When User Fill details: Title, Name, Email, Password, Date of birth
  And User Select checkbox 'Sign up for our newsletter!'
  And User Select checkbox 'Receive special offers from our partners!'
  And User Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
  And User Click 'Create Account button'
  Then User Verify that text 'ACCOUNT CREATED!' is visible
  When User Click the button continue 'Continue'
  Then User Verify that 'Logged in as username' is visible
  When User Click 'Delete Account' button
  Then User Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button