package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver ;
    private By inputField = By.id("target") ;
    private By resultText = By.id("result") ;


    public KeyPressesPage(WebDriver driver){
        this.driver = driver ;
    }
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);

    }
    public String getText(){
        return driver.findElement(resultText).getText();
    }
    public void enterSex() {
        String a =Keys.chord(Keys.ALT,"") ;
        enterText(a);
    }


}
