Feature: Feature To Test Login
  Scenario: check login is successful
    Given is on Login Page
    When users enter username and password
    And user click login
    Then we can see honepage