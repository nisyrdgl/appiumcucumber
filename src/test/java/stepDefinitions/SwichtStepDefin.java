package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PreferencePage;
import pages.SwichtPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class SwichtStepDefin {
    PreferencePage preferencePage= new PreferencePage();
    SwichtPage swichtPage = new SwichtPage();
    @When("kullanici swicht tikladi")
    public void kullanici_swicht_tikladi() {
        ReusableMethods.wait(3);
        preferencePage.swicht.click();
        ReusableMethods.wait(3);
    }


    @When("ilk swicht butonu acik olmali")
    public void ilk_swicht_butonu_acik_olmali() {
        TouchAction touchAction =new TouchAction<>(Driver.getAppiumDriver());
        if(swichtPage.switch1.getAttribute("checked").equals("KAPALI")){
            touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(swichtPage.switch1))).perform();
        }

    }
    @When("ilk swicht butonunun acik oldugunu onayla")
    public void ilk_swicht_butonunun_acik_oldugunu_onayla() {
        Assert.assertEquals("true", swichtPage.switch1.getAttribute("checked"));

    }

}
