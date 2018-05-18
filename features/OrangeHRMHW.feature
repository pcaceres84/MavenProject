
Feature: As a valid user I should be able to register PIM



  Scenario: Should be able to register employee to PIM
    Given I am using firefox browser
    When I go to the OrangeHRM website
    And Enter valid username and password
    |admin|admin|
    When I click login 
    And I click the PIM tab
    And click the Add button
    And Enter Employee First Name as "John"
    And Enter Employee Last Name as "Smith" 
    And Enter Employee ID as "01234"
    When I click the Save button
    Then I should validate PIM Employee registration
    
    


 
