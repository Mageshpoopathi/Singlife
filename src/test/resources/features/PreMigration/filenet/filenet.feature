Feature: Validate Filenet Feature

  Scenario: Filenet Validation
    Given I use the Filenet notes API to post data
    When I validate the status code of the filenet API as 200
    Then I verify that the filenet notes is created successfully