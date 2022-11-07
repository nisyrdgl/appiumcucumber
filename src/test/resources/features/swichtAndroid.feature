Feature: API Demos

  Background: test sayfasina kadar olan kisim
    Given App yuklensin
    When kullanici API Demos butununa tikladi
    When kullanici Preference butununa tikladi
    When kullanici swicht tikladi

  Scenario: Swicht Element

    And ilk swicht butonu acik olmali
    And ilk swicht butonunun acik oldugunu onayla

  @3
  Scenario: ikinci swicht element
    And ikicinci swicht kapaili olmali
    And ikinci swicht butonunun kapali oldugunu onaylar
@4
    Scenario: swicht elementler
      And ilk swicht kapali olmali
      Then ilk swichtin kapali oldugunu onaylar
      And ikinci swicht acik olmali
      And ikinci swichtin acik oldugunu onaylar
      Then screenshot al
