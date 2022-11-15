package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ExpandableListStepdefs {
    AllPage elements =new AllPage();

    @And("kullanici Arnold butununa uzun basti")
    public void kullaniciArnoldButununaUzunBasti() {
        ReusableMethods.longPressOElement(elements.expandableListPage().arnold);
    }


    @Then("kullanici {string} ekraninda")
    public void kullanici_ekraninda(String Text) {
        Assert.assertTrue(elements.expandableListPage().sampleMenu.isDisplayed());

    }



}
