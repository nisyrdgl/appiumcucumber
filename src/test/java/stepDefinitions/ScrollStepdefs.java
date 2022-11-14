package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import pages.AllPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;


public class ScrollStepdefs {
    AllPage elements = new AllPage();
    @Then("kullanici Switches tikladi")
    public void kullaniciSwitchesTikladi() {

        List<MobileElement> switchesList;

        do {
            switchesList = elements.viewsPage().switches;
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize(); // cihazin olcusunu yani ekran olculerini aldik
            // baslangic olculeri
            int start_x = (int) (dimension.width * 0.5);
            int start_y = (int) (dimension.height * 0.8);
            // bitis noktasi
            int end_x = (int) (dimension.width * 0.5);
            int end_y = (int) (dimension.height * 0.2);
            TouchAction touchAction = new TouchAction<>(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(start_x, start_y))
                    .moveTo(PointOption.point(end_x, end_y)).perform();
        }
        while (switchesList.size()==0);
            elements.viewsPage().switches.get(0).click();
        }


    @Then("kullanici Switches butonunu UIscroll ile tiklasin")
    public void kullaniciSwitchesButonunuUIscrollIleTiklasin() {
        /*
        UiScrollable() methodu sadece android sisteminde calisir cunku Android SDK uzerinden calisir
        yazdigimiz kodda verilen text'e kadar scroll yapmasi (scrollIntoView()) ve text'i bulunca durmasini istedik
        ve buldugumuz elemente seneryomuza gore tiklamasini istedik
        ****UiScrollable() kendimiz yazmamiz gerektigi icin yazim hatalarina dikkat edelim
        detayli bakmak icin link incelenebilir
        https://developer.android.com/reference/androidx/test/uiautomator/UiScrollable
         */
//        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver(); yapmaya gerek yok kendisi otomadik cast yapiyor
        ((AndroidDriver<?>) Driver.getAppiumDriver())
                .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Switches\"))");
        elements.viewsPage().switchesSingle.click();
    }

    @Then("kullanici WebView butonunu tikladi")
    public void kullaniciWebViewButonunuTikladi() {
        List<MobileElement> webView;

        do {
            webView = elements.viewsPage().switches;
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize(); // cihazin olcusunu yani ekran olculerini aldik
            // baslangic olculeri
            int start_x = (int) (dimension.width * 0.5);
            int start_y = (int) (dimension.height * 0.8);
            // bitis noktasi
            int end_x = (int) (dimension.width * 0.5);
            int end_y = (int) (dimension.height * 0.2);
            TouchAction touchAction = new TouchAction<>(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(start_x, start_y))
                    .moveTo(PointOption.point(end_x, end_y)).perform();
        }
        while (webView.size()==0);
        elements.viewsPage().webView.get(0).click();
    }

    @Then("kullanici WebView butonunu UIscroll ile tiklasin")
    public void kullaniciWebViewButonunuUIscrollIleTiklasin() {

        AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
        elements.viewsPage().webViewSingle.click();




    }
}


