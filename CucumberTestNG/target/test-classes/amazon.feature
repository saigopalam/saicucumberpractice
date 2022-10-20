Feature: amazon add to wishlist perfomance
 
  @amazonperfamance
  Scenario: amazon add wishlist
    Given i should opens the application
    When in search box search laptops
    And in filter box select hp and select one product
    And slected product add into wishlist
    And user provides required username and password credentials
    Then user get text For your security approve the notification sent to
 
