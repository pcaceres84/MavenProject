Feature:Adding Employee


  Scenario: Should be albe to add employee
   Given I am using firefox
    When I go to the OrangeHRM page
    And Enter username and password
    |admin|admin|
    When I click login button
    Then validate login 
    And click Recruitment tab
    And click Add button
    And Enter Full Name
    |John|A|Smith|
    And Enter Email
    |mail@gmail.com|
    When I click Save button
    Then validate Employee added
    

 