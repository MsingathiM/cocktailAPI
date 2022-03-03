Feature: Search beverage by parametres

  Scenario: Searching ingredients by name
    Given I open the cocktail endpoint
    When I search for an ingredient by name I expect to return the ingredient: ID,ingredient,description,type,alcohol,ABV
    Then I should validate the ingredient if it is alcoholic or non_alcoholic

  Scenario: Searching cocktails by name
    Given I navigate to the cocktail endpoint
    When I parse the cocktail name I expect to return the cocktail parametres

  Scenario: Lookup cocktails by image
    Given I get to the cocktail url endpoint
    When I parse the cocktail image name I expect to return the cocktail image
    And I search for a cocktail invalid image name I expect to receive a valid error message

  Scenario: List by key filter
    Given I navigate to the filter list url
    When I parse the filter key list value from provided options I should return list of categories based on key value parsed


