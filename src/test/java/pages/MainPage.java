package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
    public MainPage (){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }
    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    public  MobileElement apiDemos;
    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public  MobileElement anaSayfa;

}
