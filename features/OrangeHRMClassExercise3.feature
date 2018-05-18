
Feature: As a valid user I should be able to login to OrangeHRM

 
  Scenario Outline: OrangeHRM Login 
    Given I am using firefox
    When I go to the OrangeHRM page
    And I enter valid "<username>" and valid "<password>"
    And I quit the browser
    Examples:
    |username|password|
    |admin|admin|
    |jsmith|admin1|
   
    
    
