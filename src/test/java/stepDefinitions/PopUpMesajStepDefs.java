package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import pages.AllPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PopUpMesajStepDefs {
    AllPage elements =new AllPage();

    @Then("And kullanici MAKE A POPUP butununa uzun basti")
    public void and_kullanici_make_a_popup_butununa_uzun_basti() {
        ReusableMethods.longPressOElement(elements.popupMesajPage().makeAPopup);

    }




    @Then("kullanici MAKE A POPUP penceresinin acildigini dogrular")
    public void kullanici_make_a_popup_penceresinin_acildigini_dogrular() {
        ReusableMethods.wait(2);
        Assert.assertTrue(elements.popupMesajPage().addButonu.isDisplayed());


    }
    @Then("kullanici cikan popup mesajinin Add icerdigini dogrular")
    public void kullanici_cikan_popup_mesajinin_add_icerdigini_dogrular() {
        String popUpMesaj= Driver.getAppiumDriver().findElementByXPath("//android.widget.Toast").getAttribute("name");
        Assert.assertTrue(popUpMesaj.contains("Add"));

    }

}
