package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class SpinnerDrapDownStepdefns {

    AllPage elements = new AllPage();

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
        elements.spinnerPage().saturn.click();
        //çıkan popup mesajının assert işlemi
        String toast = Driver.getAppiumDriver().findElementByXPath("//android.widget.Toast").getAttribute("name");
        Assert.assertEquals("Spinner2: position=5 id=5", toast);
        System.out.println(toast);
        ReusableMethods.wait(2);
        //Saturn seçilmesinin assert etme
        Assert.assertTrue(elements.spinnerPage().saturnAssert.isDisplayed());

    }


}
