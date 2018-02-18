Feature: PracticeFeature
  This is the description: Init feature

  Scenario: Init scenario
    Given I have a test precondition
#    And I can use cucumber-lambdas
    When I execute "some" step
    And I execute "another" step
    And I use some params
      | param1 | param2 |
      | hey    | you    |
      | yes    | you    |
      | come   | here   |
    Then I should check results
    And I can use dependency
    And I can use transformer:testTransformer
    And I can read integer 101

  Scenario Outline: This scenario repeats several times
    Given I have a test precondition
    When I say <Word1> and <Word2>
    Then I should check results
    Examples:
      | Word1  | Word2    |
      | sun    | night    |
      | moon   | day      |
      | seaman | seawoman |
