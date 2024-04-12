package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {
    
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
    }

    //metodo constructor de BasePage que acepta un objeto WebDriver como argumento 
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    //metodo parametrizado para navegar a la url 
    public static void navigateToUrl(String url){
        driver.get(url);
    }

    //metodo para agrandar la pestaña del navegador al momento de realizar el test
    public static void maximazeWindow(){
        driver.manage().window().maximize();
    }

    public static void scrollOnWindow(int xOffset, int yOffset){
        try{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            // Desplaza la ventana por la cantidad de píxeles específica
            js.executeScript("window.scrollBy(arguments[0],arguments[1])", xOffset, yOffset);
        }
        catch(Exception e) {
        e.printStackTrace();
    }
      
    }

    //metodo para cerrar el nevegador con un delay de 3 segundos
    public static void closeBrowser(){
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();
    }

    //encuentra y devuelve un WebElement en la pagina usando un xpath relativo, esperando que este presente en el DOM.
    public WebElement Find(String locator) throws NoSuchElementException {
        // Esperar hasta que el elemento esté presente en el DOM y sea visible
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return element;
    }

    // metodo para hacer click en un elemento web
    public void clickOnWebElement(String locator){
         Find(locator).click();
    }

    //metodo para escribir y enviar teclas en campos de textos/ input/searchbox

    public void sendTokeys(String locator, String sendKeys){
        Find(locator).clear();
        Find(locator).sendKeys(sendKeys);
    }

    //metodo para hacer scroll en una pagina
    public static void scrollWindow(int xOffset, int yOffset) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            // Desplaza la ventana por la cantidad de píxeles específica
            js.executeScript("window.scrollBy(arguments[0],arguments[1])", xOffset, yOffset);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //metodo para apretar letra escape, scripts
    public static void pressEscapeKey() {
        try {
            // Crear un objeto JavascriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            // Ejecutar un script JavaScript para simular la pulsación de la tecla Escape (ESC)
            js.executeScript("document.dispatchEvent(new KeyboardEvent('keydown', { 'key': 'Escape' }))");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
