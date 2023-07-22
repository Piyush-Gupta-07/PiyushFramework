@tag
Feature: Test Login finctionality
  

  @tag1 @PiyushTest1
  Scenario: Test login successfully
    Given user launch login page
    Then user enter username "" from property file
    And user enter password "" from property file
    And user click on login button
    And verify user logged in


