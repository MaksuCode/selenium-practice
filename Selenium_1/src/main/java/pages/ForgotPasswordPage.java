package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver ;
    protected By emailSpace = By.id("email") ;
    protected By retrieveButton = new By.ByCssSelector("button") ;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver ;
    }
    public void setEmail(String email){
        driver.findElement(emailSpace).sendKeys(email);
    }
    public RetrivePasswordPage clickRetrieveButton(){
        driver.findElement(retrieveButton).click();
        return new RetrivePasswordPage(driver) ;
    }




}
