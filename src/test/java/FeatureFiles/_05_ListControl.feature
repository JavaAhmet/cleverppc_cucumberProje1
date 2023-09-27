Feature: List Control

  Scenario: Control of the number of products listed

    Given Navigate to Cleverppc
    When User Clicks on the dresses category
    Then Validating the number at the top of the list
    And Validating the number at the buttom of the list
    Then Check the number by counting list products
