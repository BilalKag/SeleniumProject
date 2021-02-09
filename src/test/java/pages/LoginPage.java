package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage{

    By kullaniciAdi = By.id("L-UserNameField");
    By parola = By.id("L-PasswordField");
    By btnLogin = By.id("gg-login-enter");

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginIn(String username , String password){
        driver.findElement(kullaniciAdi).sendKeys(username);
        driver.findElement(parola).sendKeys(password);
        driver.findElement(btnLogin).click();
        Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",driver.getTitle() );
    }





}
