Feature: Login feature

  Scenario: As a user i want to login to application with valid username and password
    Given I will launch the browser
    And I will enter the url
    When Login page is displayed i will enter username and password
    And I will click on login
    Then I will validate whether home page is displayed or not
     
	