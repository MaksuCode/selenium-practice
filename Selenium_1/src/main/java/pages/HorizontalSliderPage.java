package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver ;
    private By slider = new By.ByCssSelector("[type='range']");
    private By range = By.id("range") ;

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver ;

    }
    public void clickOntheSlider(){
        driver.findElement(slider).click();

    }

    public void moveSlider(String rangeValue) throws InterruptedException {
        while (!getRange().equals(rangeValue)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
            System.out.println(getRange());
        }

    }
    public String getRange(){
        return driver.findElement(range).getText();
    }

}
