package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPageEx2 {

    private By startButton = By.cssSelector("#start button");
    private WebDriver driver ;

    public DynamicLoadingPageEx2(WebDriver driver){
        this.driver = driver ;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
    }

    public String getLoadedText(){
        return driver.findElement(By.id("finish")).getText() ;
    }


}
