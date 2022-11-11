package pages;

import pages.android.*;

public class AllPage {
    public AllPage() {
    }
    private ApiDemoPage apiDemoPage;
    private MainPage mainPage;
    private PreferencePage preferencePage;
    private PreferenceDependenciesPage preferenceDependenciesPage;
    private SwichtPage swichtPage;
    private ViewsPage viewsPage;
    private  DragDropPage dragDropPage;
    private  DateWidgetsPage dateWidgetsPage;
    public DateWidgetsPage dateWidgetsPage(){
        if (dateWidgetsPage == null){
            dateWidgetsPage= new DateWidgetsPage();
        }
        return  dateWidgetsPage;
    }
    public ApiDemoPage apiDemoPage(){
        if (apiDemoPage == null){
            apiDemoPage= new ApiDemoPage();
        }
        return  apiDemoPage;
    }
    public  MainPage mainPage(){
        if (mainPage == null){
            mainPage =new MainPage();
        }
        return mainPage;
    }
    public PreferencePage preferencePage(){
        if (preferencePage==null){
            preferencePage =new PreferencePage();
        }
        return  preferencePage;
    }
    public  PreferenceDependenciesPage preferenceDependenciesPage(){
        if (preferenceDependenciesPage==null){
            preferenceDependenciesPage =new PreferenceDependenciesPage();

        }
        return  preferenceDependenciesPage;
    }
    public  SwichtPage swichtPage(){
        if (swichtPage == null){
            swichtPage =new SwichtPage();
        }
        return  swichtPage;
    }
    public  ViewsPage viewsPage(){
        if (viewsPage == null){
            viewsPage =new ViewsPage();
        }
        return  viewsPage;
    }
    public DragDropPage dragDropPage(){
        if(dragDropPage == null){
            dragDropPage =new DragDropPage();

        }
        return  dragDropPage;
    }
}
