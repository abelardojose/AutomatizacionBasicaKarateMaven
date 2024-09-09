Feature: Get user on reqres

  Background:
    * def urlBase = "https://reqres.in"

  Scenario: Get a user
    Given url urlBase + "/api/users/" + "2"
    When method get
    Then status 200

  Scenario: Get a list of user
    Given url urlBase + "/api/users?page=1"
    When method get
    Then status 200
    And match $ == read("list_of_users.json")
