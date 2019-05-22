Feature: To check the login functionality

  Scenario: Successful Login with Valid Credentials
    Given user is on wordpress.org website
    When user enter some text and click enter
    Then click on login button in the new screen
    When user is on Login Screen and enter Valid Username and Password
    Then click Submit to Validate
    
