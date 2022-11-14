package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;

public class ReusableMethods {
    public static void clickOnPage(String pageName) {
        List<MobileElement> pages = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");

        for (MobileElement page : pages) {
            if (page.getText().equals(pageName)) {

                System.out.println(page.getText() + " tiklandi");
                page.click();
                wait(3);
                break;
            }

        }
    }

    public static void scrollWithUiScrollable(String Text) {
        AndroidDriver<MobileElement> driver = (AndroidDriver) Driver.getAppiumDriver();
        //elementi buluncaya kadar scoll yap
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + Text + "\"))");
        //1-)elementi bulunca tikla method ile
        clickOnPage(Text);
        //2-)klasik yol ile
       // driver.findElementByXPath("//*[@text='" + Text + "']").click();

    }

    public static void wait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
