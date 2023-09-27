Feature: DataTable Login Functionality

  Background:
    Given Navigate to Cleverppc
    When Click to sign in

  Scenario Outline: Login with email and password

    When Send keys email as "<useremail>" password as "<userpassword>"
    Then Fail message should be displayed
    Examples:
      | useremail                    | userpassword |
      | teamone.techno@gmail.com     | 55555        |
      | teamoness.technoss@gmail.com | 987654321    |

  Scenario Outline: Login with email and password
    When Send keys email as "<useremail>" password as "<userpassword>"
    Then Password required message should be displayed
    Examples:
      | useremail                | userpassword |
      | teamone.techno@gmail.com |              |

  Scenario Outline: Login with email and password
    When Send keys email as "<useremail>" password as "<userpassword>"
    Then Email required message should be displayed
    Examples:
      | useremail | userpassword |
      |           |              |

  Scenario Outline: Login with email and password
    When Send keys email as "<useremail>" password as "<userpassword>"
    Then Welcome message should be displayed
    Examples:
      | useremail                | userpassword |
      | teamone.techno@gmail.com | 987654321    |

