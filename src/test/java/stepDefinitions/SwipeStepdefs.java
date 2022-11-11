package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import pages.AllPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class SwipeStepdefs {
    AllPage elements =new AllPage();
    TouchAction touchAction =new TouchAction<>(Driver.getAppiumDriver());
    @And("kullanici Date Widgets butununa tikladi")
    public void kullaniciDateWidgetsButununaTikladi() {
        elements.viewsPage().dateWidgets.click();

    }
    @And("kullanici ikinci Inline butununa tikladi")
    public void kullaniciIkinciInlineButununaTikladi() {
        elements.dateWidgetsPage().ikinciInline.click();
    }

    @And("kullanici {int} tiklasin")
    public void kullaniciTiklasin(int num9) {
        touchAction.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(elements.dateWidgetsPage().num9)))
                .perform();


        
    }

    @And("kulanici {int} ten {int} e yesil topu kaydirsin:")
    public void kulaniciTenEYesilTopuKaydirsin(int num15, int num45) {

        touchAction.press(ElementOption.element(elements.dateWidgetsPage().num15))//press beklemek
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // 1 saniye bekle
                .moveTo(ElementOption.element(elements.dateWidgetsPage().num45)).perform();//45 ustune getir
    }
}
