package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class DragDropStepdefs {
    AllPage allPage =new AllPage();

    @Then("kullanici Views butonuna tikladi")
    public void kullaniciViewsButonunaTikladi() {
        allPage.apiDemoPage().views.click();



    }

    @And("kullanici Drag and Drop butonuna tikladi")
    public void kullaniciDragAndDropButonunaTikladi() {
        allPage.viewsPage().dragAndDrop.click();
        
    }

    @When("kullanici birinci topu ikici topun ustune brakti")
    public void kullaniciBirinciTopuIkiciTopunUstuneBrakti() {
        TouchAction touchAction= new TouchAction<>(Driver.getAppiumDriver());
        touchAction.longPress(ElementOption.element(allPage.dragDropPage().birinciTop))
                .moveTo(ElementOption.element(allPage.dragDropPage().ikinciTop)).release().perform();
        
    }



    @Then("kullanici cikan texti dogrular")
    public void kullaniciCikanTextiDogrular() {
        ReusableMethods.wait(6);
        Assert.assertTrue(allPage.dragDropPage().text.isDisplayed());
    }
}
