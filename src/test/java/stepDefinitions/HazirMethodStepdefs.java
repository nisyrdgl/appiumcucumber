package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReusableMethods;

public class HazirMethodStepdefs {
    @When("kullanici {string} butununa tikladi")
    public void kullanici_butununa_tikladi(String pageName) {
        ReusableMethods.clickOnPage(pageName);

    }



    @Then("kullanici {string} butonunu UIscroll ile Reusable Method ile tiklasin")
    public void kullaniciButonunuUIscrollIleReusableMethodIleTiklasin(String Text) {
        ReusableMethods.scrollWithUiScrollable("WebView");
    }
}
