#Sample Feature Definition Template
Feature: Apply to amaris
  I want to be able to check that the amaris apply page is working correctly

  @Apply
  Scenario: Open the amaris page
    Given I navigate to the amaris web page
    When I click on the apply button
    Then The apply page has to be loaded correctly

  @WIP
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
