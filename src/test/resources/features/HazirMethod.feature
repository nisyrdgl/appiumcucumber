Feature: Api Demos
  @hazirMethod
  Scenario: hazir methot kullanimi
    Given App yuklensin
    When kullanici "API Demos" butununa tikladi
    When kullanici "Preference" butununa tikladi
    When kullanici "3. Preference dependencies" butununa tikladi
    And kullanici WiFi check box secmis olacak
    And kullanici "WiFi settings" butununa tikladi
    And kullanici "text" yazdi
    And kullanci ok butonuna tikladi
@webview
  Scenario: WebView tiklama
    Given App yuklensin
    When kullanici "API Demos" butununa tikladi
    When kullanici "Views" butununa tikladi
    Then kullanici "WebView" butonunu UIscroll ile Reusable Method ile tiklasin
