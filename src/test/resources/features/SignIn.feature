Feature: Sign In Feature

  Scenario: Verify user can sign in into Retail Application
    When User click on Sign in option
    And User enter email 'gulpato@gmail.com' and password 'Pato@123'
    And User click on login button
    Then User should be logged in into Account

  
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email             | password    | confirmPassword |
      | gulpari | gulpari140@gmail.com | Gulpari@123 | Gulpari@123     |
    And User click on SignUp button
    Then User should be logged into account page
