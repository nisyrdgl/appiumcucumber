package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ApiDemoPage;
import pages.MainPage;
import pages.PreferenceDependenciesPage;
import pages.PreferencePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class IlkTestStepDefinition {
    MainPage mainPage = new MainPage();
    ApiDemoPage apiDemoPage = new ApiDemoPage();
    PreferencePage preferencePage = new PreferencePage();
    PreferenceDependenciesPage preferenceDependenciesPage = new PreferenceDependenciesPage();


    @Given("App yuklensin")
    public void app_yuklensin() {
        Driver.getAppiumDriver();

    }

    @Given("kullanici API Demos butununa tikladi")
    public void kullanici_api_demos_butununa_tikladi()  {


        mainPage.apiDemos.click();
        ReusableMethods.wait(7);
    }



    @Then("kullanici Preference butununa tikladi")
    public void kullanici_preference_butununa_tikladi() {

        apiDemoPage.preference.click();
        ReusableMethods.wait(7);

    }



    @Then("kullanici Preference dependencies tikladi")
    public void kullanici_preference_dependencies_tikladi() {
        preferencePage.preferenceDependencies.click();
        ReusableMethods.wait(7);
    }

    @Then("kullanici WiFi check box secmis olacak")
    public void kullanici_wi_fi_check_box_secmis_olacak() {
        if(preferenceDependenciesPage.wifiCheckbox.getAttribute("checked").equals("false")){
            preferenceDependenciesPage.wifiCheckbox.click();
        }

    }

    @Then("kullanici WiFi Settings tikladi")
    public void kullanici_wi_fi_settings_tikladi() {
        preferenceDependenciesPage.wifiSettings.click();

    }



    @Then("kullanici {string} yazdi")
    public void kullanici_yazdi(String string) {
        preferenceDependenciesPage.textBox.sendKeys("appiumtest");

    }

    @Then("kullanci ok butonuna tikladi")
    public void kullanci_ok_butonuna_tikladi() {
        preferenceDependenciesPage.tamam.click();

    }

}
