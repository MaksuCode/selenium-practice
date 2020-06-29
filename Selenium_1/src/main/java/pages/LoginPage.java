package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.rmi.runtime.Log;

public class LoginPage {

    private WebDriver driver ;
    private By usernameField = By.id("username") ;
    private By passwordField = By.id("password") ;
    private By loginButton = new By.ByCssSelector("button");
    private By invalidLoginMessage = By.id("flash");
    private String invalidLoginMessageText ;


    public LoginPage(WebDriver driver){
        this.driver = driver ;
    }
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLogin(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver) ;
    }
    public String getInvalidLoginMessage(){
        return driver.findElement(invalidLoginMessage).getText();

        }



    }


