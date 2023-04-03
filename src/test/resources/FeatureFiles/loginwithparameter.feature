
Feature: Actitime login with parameters
 
  Scenario outline: valid and Invalid login credentials.
    Given User launches browser and enters URL of Actitime.
    
    When User enters <username> and <password>
   
    And clicks on login
    Then home Page <status> is displayed
   

  

    Examples: 
      | Username  | password | status  |
      | admin     |  manager | success |
      | trainee   | tarinee  | success |
      |abcd       | efgh     |  fail   |
