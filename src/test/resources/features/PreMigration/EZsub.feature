Feature: Validate Ezsub Feature

  Scenario: Quotation Validation
    Given I use the create quotation API to post data
    When I verify that the quotation is created successfully
    Then I validate the status code of the API
