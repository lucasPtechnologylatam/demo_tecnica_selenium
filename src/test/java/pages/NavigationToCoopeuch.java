package pages;

public class NavigationToCoopeuch extends BasePage{
    
    public NavigationToCoopeuch() {
        super(driver);
    }

    public void navigateToCoopeuch(){
        navigateToUrl("https://webprivadoecdqa2.coopeuch.cl/#/");
    }
}
