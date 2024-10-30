Feature: General user view


  Scenario: Validate General User able to view product without logging in
    Given User navigates to the online product page
    When 	User click on formal shoe dropdown
    Then  User should able to view the product 
