package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver ;
    protected By secureAreaMessage = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver ;

    }

    public String getSecureAreaMessage() {

        return driver.findElement(secureAreaMessage).getText();


    }
}
