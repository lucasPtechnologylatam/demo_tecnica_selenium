package steps;

import io.cucumber.java.en.*;

import pages.SimularCredito;

public class SimulacionCoopeuchSteps {
  
    SimularCredito simularCredito = new SimularCredito();

    //Escenario para  simular el credito
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
