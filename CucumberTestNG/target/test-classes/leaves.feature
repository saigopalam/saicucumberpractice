
Feature: Leaves feature file


Scenario: Apply leaves validation
Given when user opens the application
When user provides required username and password credentials
And log in to the application
And User click on leave button
And User selects from and to address
And click on search button
Then validate whether user is able to see list of leaves



Then logout of the application
