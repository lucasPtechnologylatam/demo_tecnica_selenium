package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimularCredito extends BasePage{

    private String buttonCredits = "//*[@id='menu-2-7']";
    private String buttonSimulate = "//*[@id='action-button']";
    private String amountInput ="//input[@type='text' and @placeholder='Ingresa un monto']";
    private String installmentsInput = "//*[@id='root']/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div/div/div/div/form/div/div/div/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input";
    private String buttonSimulateCredit ="/html/body/div/div/div/div[2]/div/div[3]/div[1]/div[2]/div/div/div/div/div/div/form/div/div/div/div[2]/div[2]/button";
    public SimularCredito() {
        super(driver);
    }

    public void clickOnButtonConsumerCredit(){
        clickOnWebElement(buttonCredits);
    }

    public void clickOnSimulateButton(){
        clickOnWebElement(buttonSimulate);
    }

    public void clickOnInputAmount(){
        clickOnWebElement(amountInput);
    }

    public void sendKeysToAmountInput(String keys){
        sendTokeys(amountInput, keys);
    }

    public void clickOnInstallmentsInput(){
        clickOnWebElement(installmentsInput);
    }

    public void sendKeysToInstallmentst(String keys){
        sendTokeys(installmentsInput, keys);
    }


    public void clickOnSimulateCredits(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonSimulateCredit)));

        clickOnWebElement(buttonSimulateCredit);
        scrollOnWindow(0,600);
    }
}


