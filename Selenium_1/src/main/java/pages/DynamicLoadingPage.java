package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver ;
    private By example1Xpath = By.xpath("/html/body/div[2]/div/div/a[1]") ;
    private By example2Xpath = By.xpath("/html/body/div[2]/div/div/a[2]") ;

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver ;
    }

    public DynamicLoadingPageEx1 clickExample1(){
        driver.findElement(example1Xpath).click();
        return new DynamicLoadingPageEx1(driver) ;

    }

    public DynamicLoadingPageEx2 clickExample2(){
        driver.findElement(example2Xpath).click();
        return new DynamicLoadingPageEx2(driver) ;

    }
}
