package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import java.util.concurrent.TimeUnit;


public class BaseTest {


    private  WebDriver driver ;
    protected HomePage homePage ;

    @BeforeClass  //It will run before each of the test classes.
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maksu\\Desktop\\ChromeDriver\\chromedriver.exe") ;
        driver = new ChromeDriver() ;
//        driver.manage().timeouts().pageLoadTimeout();
//        driver.manage().timeouts().setScriptTimeout()
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ; // Up until 10 seconds waits. Be careful using it at project level.Bec it can slow your tests.
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod   //After each
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass   //It will run after test classes.
    public void shutDown(){
        driver.quit();
    }

}






