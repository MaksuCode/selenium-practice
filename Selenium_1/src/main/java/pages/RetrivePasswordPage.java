package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrivePasswordPage {

    private WebDriver driver ;
    private By emailSentNotification = By.id("content");

    public RetrivePasswordPage(WebDriver driver){
        this.driver = driver ;
    }
    public String  getEmailSentNotification(){
        return driver.findElement(emailSentNotification).getText();

    }
}
