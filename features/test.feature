
Feature: As a valid user when I enter my credentials, I should be able to login
@Firefox
Scenario: As an editor I should be able to login to the appication
    Given I have a firefox browser running
    When I go to the website
    And I enter valid username
    And I enter valid password
    When I click on the login button
    Then I should see a logout link
    @Chrome
    Scenario: As an editor I should be able to login to the appication
    Given I have a Chrome browser running
    When I go to the website
    And I enter valid username
    And I enter valid password
    When I click on the login button
    Then I should see a logout link
    @Firefox
    Scenario: As an editor I should be able to login to the appication
    Given I have a firefox browser running
    When I go to the website
    And I enter valid username
    And I enter valid password
    When I click on the login button
    Then I should see a logout link

  