package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.android.PreferencePage;
import pages.android.SwichtPage;
import utilities.Driver;
import utilities.ReusableMethods1;

public class SwichtStepDefin {
    TouchAction touchAction =new TouchAction<>(Driver.getAppiumDriver());
    PreferencePage preferencePage= new PreferencePage();
    SwichtPage swichtPage = new SwichtPage();
    @When("kullanici swicht tikladi")
    public void kullanici_swicht_tikladi() {
        ReusableMethods1.wait(3);
        preferencePage.swicht.click();
        ReusableMethods1.wait(3);
    }


    @When("ilk swicht butonu acik olmali")
    public void ilk_swicht_butonu_acik_olmali() {

        if(swichtPage.switch1.getAttribute("checked").equals("KAPALI")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(swichtPage.switch1))).perform();
        }

    }
    @When("ilk swicht butonunun acik oldugunu onayla")
    public void ilk_swicht_butonunun_acik_oldugunu_onayla() {
        Assert.assertEquals("true", swichtPage.switch1.getAttribute("checked"));

    }

    @And("ikicinci swicht kapaili olmali")
    public void ikicinciSwichtKapailiOlmali() {

        if(swichtPage.switch1.getAttribute("checked").equals("true")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(swichtPage.switch2))).perform();
        }

    }

    @And("ikinci swicht butonunun kapali oldugunu onaylar")
    public void ikinciSwichtButonununKapaliOldugunuOnaylar() {
        Assert.assertEquals("false", swichtPage.switch2.getAttribute("checked"));
    }

    @And("ilk swicht kapali olmali")
    public void ilkSwichtKapaliOlmali() {
        if(swichtPage.switch1.getAttribute("checked").equals("true")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(swichtPage.switch1))).perform();
        }

        
    }

    @Then("ilk swichtin kapali oldugunu onaylar")
    public void ilkSwichtinKapaliOldugunuOnaylar() {
        Assert.assertEquals("false",swichtPage.switch1.getAttribute("checked"));
        
    }

    @And("ikinci swicht acik olmali")
    public void ikinciSwichtAcikOlmali() {
        if (swichtPage.switch2.getAttribute("checked").equals("false")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(swichtPage.switch2))).perform();
        }
        
    }

    @And("ikinci swichtin acik oldugunu onaylar")
    public void ikinciSwichtinAcikOldugunuOnaylar() {
        Assert.assertEquals("true",swichtPage.switch2.getAttribute("checked"));
    }


}
