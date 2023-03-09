Feature: Retail Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'gulpari128@gmail.com' and password 'Gulpari@04'
    And User click on login button
    Then User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'gulalay' and Phone '5106999342'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Gulpari@03       | Gulpari@04  | Gulpari@04      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7899864634783270 | gulalay    |               6 |           2024 |          980 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7899834634783770 | gulalay    |               3 |           2025 |          243 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’
