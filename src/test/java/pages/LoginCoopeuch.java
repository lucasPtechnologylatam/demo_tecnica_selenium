package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginCoopeuch extends BasePage {

    private String inputUsername = "//*[@id='login-input-rut']";
    private String inputPassword = "//*[@id='login-input-password']";
    private String buttonIngresar = "//*[@id='login-submit']";

    public LoginCoopeuch() {
        super(driver);
    }

    public void clickOnInputUsername() {
        clickOnWebElement(inputUsername);
    }

    public void sendKeysToUsername(String keys) {
        sendTokeys(inputUsername, keys);
    }

    public void clickOnInputPassword() {
        clickOnWebElement(inputPassword);
    }

    public void sendKeysToPassword(String keys) {
        sendTokeys(inputPassword, keys);
    }

    public void clickOnButtonIngresar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonIngresar)));
        clickOnWebElement(buttonIngresar);
    }
}
