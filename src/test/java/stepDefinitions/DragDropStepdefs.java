package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllPage;

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
        
    }

    @Then("kullanici dorduncu top gorecek")
    public void kullaniciDorduncuTopGorecek() {
    }
}
