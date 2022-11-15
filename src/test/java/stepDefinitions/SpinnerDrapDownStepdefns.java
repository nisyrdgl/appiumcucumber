package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPage;
import utilities.ReusableMethods;

public class SpinnerDrapDownStepdefns {
  
    AllPage elements =new AllPage();
    @When("kullanici Spinner butonunu UIscroll ile Reusable Method ile tiklasin")
    public void kullaniciSpinnerButonunuUIscrollIleReusableMethodIleTiklasin() {
        ReusableMethods.scrollWithUiScrollable("Spinner");
    }


    @Then("kullanici Color sekmesinden {string} secebilmeli")
    public void kullaniciColorSekmesindenSecebilmeli(String arg0) {
        elements.spinnerPage().colorDropDown.click();
        ReusableMethods.wait(3);
        elements.spinnerPage().blue.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(elements.spinnerPage().blueAssert.isDisplayed());
    }

    @And("kullanici planet sekmesinden {string} secebilmeli")
    public void kullaniciPlanetSekmesindenSecebilmeli(String arg0) {
        elements.spinnerPage().planetDropDown.click();
        ReusableMethods.wait(3);
        elements.spinnerPage().saturn.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(elements.spinnerPage().saturnAssert.isDisplayed());


    }


}
