
Feature: DataTable Register Functionality


    Background:
    Given Navigate to Clever
    When Click to sign in


  Scenario: Register with new email
    And Sendkeys email
      | createAccountEmail |


    And Click to create an account button
    | createAccountBtn |

    And Send keys in denizLocators
    | firstName | Ali |
    | lastName  | Yilmaz |
    | password  | 987654 |

    And Sendkeys Registeremail
      | email     |

    And Click to register button
    | registerBtn |

    Then Success message should be displayed

