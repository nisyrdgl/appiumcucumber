package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class DragDropPage {
    public DragDropPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15) ),this);

    }
    @AndroidFindBy(xpath = "(//android.view.View)[1]")
    public MobileElement birinciTop;
    @AndroidFindBy(xpath = "(//android.view.View)[2]")
    public MobileElement ikinciTop;
    @AndroidFindBy(xpath = "(//android.view.View)[3]")
    public MobileElement ucuncuTop;
}
