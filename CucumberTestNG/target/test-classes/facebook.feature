Feature: facebook login
 

  @facebookloginwithdata
  Scenario: facebook login application
  
    Given i should opens the application
    When user provides required username and password credentials
    And log in to the application
    Then alert close

 