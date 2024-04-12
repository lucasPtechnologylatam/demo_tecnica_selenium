package steps;

import io.cucumber.java.en.*;
import pages.LoginCoopeuch;
import pages.NavigationToCoopeuch;
import pages.SimularCredito;

public class SimulacionCoopeuchSteps {
    NavigationToCoopeuch navegacionACoopeuch = new NavigationToCoopeuch();
    LoginCoopeuch loginCoopeuch = new LoginCoopeuch();
    SimularCredito simularCredito = new SimularCredito();


    //Escenario para ingresar a sitio coopeuch y banca Coopeuch
    @Given("I go to the website to Coopeuch")
    public void navigateCoopeuch(){
        navegacionACoopeuch.navigateToCoopeuch();
    }

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

    @Then("I cick on button Ingresar")
    public void clickOnButtonLogin(){
        loginCoopeuch.clickOnButtonIngresar();
    }

    //Escenario para elegir entre mis productos y simular el credito
    @Given("I click on button Credito Consumo")
    public void clickOnButtonCredits(){
        simularCredito.clickOnButtonConsumerCredit();
    }

    @And("I click on Simular")
    public void clickOnSimulate(){
        simularCredito.clickOnSimulateButton();
    }

    @And("I click on amount input")
    public void clickOnInputAmountSimulate(){
        simularCredito.clickOnInputAmount();
    }

    @And("I write the amount to simulate")
    public void sendKeysToAmountInputSimulate(){
        simularCredito.sendKeysToAmountInput("2000000");
    }

    @And("I click on the installments")
    public void clickOnButtonInstallmenst(){
        simularCredito.clickOnInstallmentsInput();
    }

    @And("I write the number of installments")
    public void sendKeysToInstallmentstInput(){
        simularCredito.sendKeysToInstallmentst("24");
    }

    @Then("I click on Simular credits")
    public void clickOnSimulateCredit(){
        simularCredito.clickOnSimulateCredits();
    }

}
