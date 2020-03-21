Feature: the message can be retrieved
  Scenario: client makes call to POST /kambaneducations
    When the client calls /kambaneducations
    Then the client receives status code of 200
    And the client receives server version Welcome To Kamban Educations
  Scenario: client makes call to GET /hello
    Given the client calls /hello
    When the client receives status code of 200
    Then the client receives server version hello