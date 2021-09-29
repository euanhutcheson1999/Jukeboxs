Feature: Selecting an album

  Scenario: Selecting rumours on the console
    Given I have selected rumours
    When I have selected an input in the console
    Then  I should be told "Yes"


  Scenario: Selecting rumours on the console
    Given I have not selected rumours
    When I have selected an input in the console
    Then  I should be told "No"

