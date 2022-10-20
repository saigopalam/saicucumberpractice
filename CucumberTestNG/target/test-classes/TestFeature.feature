Feature: Sample feature file


@hrsslogin
Scenario: Sample login validation
Given when user opens the application
When user provides required username and password credentials
And log in to the application
Then logout of the application

@hrssloginwithdata
Scenario Outline: Sample login validation
Given when user opens the application
When user provides required "Admin" and "admin123" credentials
And log in to the application
Then logout of the application

@hrssloginwithdatatables
Scenario Outline: Sample login validation
Given when user opens the application
When user provides required "<UserName>" and "<Password>" credentials
And log in to the application
Then logout of the application
Examples:
|UserName|Password|
|Admin|admin123|

@facebook
Scenario: facebook login

Given user hit the url of application
When user login to the application
And user get the pageTitle 
Then verify pagetitle is correct
And user logout from application



