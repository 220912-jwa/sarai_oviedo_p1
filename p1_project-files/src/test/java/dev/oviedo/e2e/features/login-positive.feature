Feature: Login

  Scenario Outline: Login with correct credentials
    Given The employee is on the login page
    When The employee types <username> into username input
    When The employee types <password> into password input
    When The employee clicks on the login button
    Then The employee should see their name <fname> on the home page

    Examples:
      | username    | password         | fname  |
      | tsmith2842  | hawaii100red     | Thema  |
      | ovallez9452 | alaska200blue    | Oliver |
      | abanks9004  | arizona300orange | Aurora |