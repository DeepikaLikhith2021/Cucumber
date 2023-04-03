
Feature: Actitime login

  
  Scenario: Login with valid credentials
    Given User launches browser and enters Actitime URL
   
    When User enters valid username and password
    And click on login button
   
    Then Actitime home page should be displayed
    
 