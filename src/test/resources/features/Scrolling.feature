Feature: Api Demos

  Background: Test asamasina kadar ortak olan adimlar
    Given App yuklensin
    When kullanici API Demos butununa tikladi
    When  kullanici Views butonuna tikladi

  @Scroll
  Scenario: Scroll to element and click

    Then kullanici Switches tikladi

  @Single
  Scenario: UIscrollable ile
    Then  kullanici Switches butonunu UIscroll ile tiklasin
@Scroll2
  Scenario: WebView tiklama
    Then kullanici WebView butonunu tikladi
@Single2
  Scenario: WebView tiklama
    Then kullanici WebView butonunu UIscroll ile tiklasin