Feature: API Demos expandable list
  @expandable
  Scenario: Expandable list test
    Given App yuklensin
    When kullanici "API Demos" butununa tikladi
    When kullanici "Views" butununa tikladi
    When kullanici "Expandable Lists" butununa tikladi
    When kullanici "1. Custom Adapter" butununa tikladi
    And kullanici "People Names" butununa tikladi
    And kullanici Arnold butununa uzun basti
    Then kullanici "Sample menu" ekraninda