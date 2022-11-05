package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ApiDemoPage {
    public ApiDemoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API Demos']")
    public  MobileElement apiDemosAnasayfa;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement preference;
}
