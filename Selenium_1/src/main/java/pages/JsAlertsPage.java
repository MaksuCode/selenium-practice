package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlertsPage {
    private WebDriver driver ;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']") ;   ///Xpath usage ??
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']") ;
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By resultMessage = By.id("result") ;

    public JsAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept(); ;

    }
    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public String  getTextOfAlert(){
        return driver.switchTo().alert().getText();
    }
    public void alert_clickToCancel(){
        driver.switchTo().alert().dismiss();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void enterTextInPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
