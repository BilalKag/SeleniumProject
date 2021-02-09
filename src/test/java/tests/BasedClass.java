package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasedClass {

    public WebDriver driver;
    protected static WebDriverWait wait;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bilal Kağızmanlıoğlu\\Desktop\\SeleniumProject\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,1000);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
       //driver.quit();
    }
    public void openBrowser(String url){
        driver.get(url);
    }


}
