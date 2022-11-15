Feature: Drap drown
  @drapdown
  Scenario: Kullanici drap down menusunden secim yapar
    Given App yuklensin
    When kullanici "API Demos" butununa tikladi
    When kullanici "Views" butununa tikladi
    When kullanici Spinner butonunu UIscroll ile Reusable Method ile tiklasin
    Then kullanici Color sekmesinden "blue" secebilmeli
    And kullanici planet sekmesinden "Saturn" secebilmeli

