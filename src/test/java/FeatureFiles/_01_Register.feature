
Feature: Register functionality

  Scenario: Register with valid username and password

    Given Navigate to Cleverppc
    When Sign in and enter email and click create an account click register button
    Then User should register successfully