Feature: Login user view


  Scenario: validate user is able to view after login
    Given User navigates to the login page
    When 	User successfully enters the login details
    Then  User should able to view product category page
  

