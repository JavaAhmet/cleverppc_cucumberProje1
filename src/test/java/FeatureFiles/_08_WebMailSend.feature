Feature: Emailsendcan functionality
  @Regression
  Scenario: Contact us part sended can valid Email


    When Click to element contact us
    And Select to element SubjectHeading
    And User sending the keys in email
    And User sending the keys in referansno
    And Click to element Choose File
    And Upload File with RobotClass
    And User sending the keys in message
    And Click to element send
    Then Your message has been successfully


