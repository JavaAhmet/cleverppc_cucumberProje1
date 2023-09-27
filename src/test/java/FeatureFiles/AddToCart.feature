Feature: Login functionality

  @SmokeTest
  Scenario: Login with valid email and password and click sign in

    Given Navigate to CleverPPC
    And click SignIn button and enter email and enter password and click Sign in button
    And navigate to summer dresses
    When user selects a random dress and click add to cart button
    And product should be successfully added to the cart