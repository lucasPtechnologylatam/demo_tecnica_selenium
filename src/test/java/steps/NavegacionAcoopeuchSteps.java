package steps;


import io.cucumber.java.en.*;
import pages.NavigationToCoopeuch;
public class NavegacionAcoopeuchSteps {
    
    NavigationToCoopeuch navegacionACoopeuch = new NavigationToCoopeuch();

     //Escenario para ingresar a sitio coopeuch y banca Coopeuch
     @Given("I go to the website to Coopeuchs")
     public void navigateCoopeuch(){
         navegacionACoopeuch.navigateToCoopeuch();
     }
 
}
