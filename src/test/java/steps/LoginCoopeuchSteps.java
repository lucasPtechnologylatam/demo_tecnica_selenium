package steps;


import io.cucumber.java.en.*;
import pages.LoginCoopeuch;

public class LoginCoopeuchSteps {
    LoginCoopeuch loginCoopeuch = new LoginCoopeuch();

    //Escenario para iniciar sesión en banca en linea coopeuch
    @Given("I click on input username")
    public void clickOnInputUsernameLogin(){
        loginCoopeuch.clickOnInputUsername();
    }

    @And("I send my username to input Ingresa tu Rut")
    public void sendKeysToUsernameLogin(){
        loginCoopeuch.sendKeysToUsername("120797573");
    }

    @And("I click on input password")
    public void clickOnInputPasswwordLogin(){
        loginCoopeuch.clickOnInputPassword();
    }

    @And("I send my password to input Ingresa tu clave internet")
    public void sendKeysToPasswordLogin(){
        loginCoopeuch.sendKeysToPassword("A1234567");
    }

    @Then("I click on button Ingresar")
    public void clickOnButtonLogin(){
        loginCoopeuch.clickOnButtonIngresar();
    }

}
