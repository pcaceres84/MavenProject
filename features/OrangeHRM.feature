

Feature: As a valid user I should be able to login

  Scenario: As an editor I should be able to login
    Given I have a firefox browser running
    When I go to the site
    And enter valid username as "admin"
    And enter valid password as "admin"
    When I click the login button
    Then I should validate login
    
    Scenario: I should be able to register candidates under recruitment
    Given I have a firefox browser running
    When I go to the site
    And enter valid username
    And enter valid password
    When I click the login button
    And I click on Recruitment link
    And I click Add button
    And I type in First Name
    And I type in Last Name
    And I type in email
    When I click the save button
    Then I should validate registered name
    
    
    