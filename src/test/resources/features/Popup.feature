Feature: API Demos
  @popupMesaj
  Scenario: PopUp mesaj
    Given App yuklensin
    When kullanici "API Demos" butununa tikladi
    When kullanici "Views" butununa tikladi
    When kullanici "Popup Menu" butununa tikladi
    Then  And kullanici MAKE A POPUP butununa uzun basti
    And kullanici MAKE A POPUP penceresinin acildigini dogrular
    And kullanici "Add" butununa tikladi
    And kullanici cikan popup mesajinin Add icerdigini dogrular

