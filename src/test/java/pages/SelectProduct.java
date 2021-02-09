package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SelectProduct {

    private WebDriver driver;

    public SelectProduct(WebDriver driver) {
        this.driver = driver;
    }

    By addcrt   = By.id("add-to-basket");
    By gocrt    = By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[3]/a");
    By icon     = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div[2]/select/option[2]");
    By dltcrt   = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/div[2]/div[6]/div[2]/div[2]/div[3]/div/div[2]/div/a/i");
    By dltcntrl = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/i");


    public void randomProduct(){
        int sayi = (int)(Math.random()*48);
        System.out.println(sayi +". ürün seçildi...");
        By product = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[3]/div[2]/ul/li[" + sayi + "]/a/div/div/div[1]");
        driver.findElement(product).click();
    }

    public void addtoCart(){
        WebElement myelement = driver.findElement(addcrt);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myelement);
        driver.findElement(addcrt).click();
    }

    public void goCart(){
        driver.findElement(gocrt).click();

    }
    public void addNewProduct(){
        WebElement myelement = driver.findElement(icon);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myelement);
        driver.findElement(icon).click();

    }
    public void checkNumberofProduct(){

        Assert.assertEquals( "2" , driver.findElement(icon).getText().replace(" ",""));
    }
    public void deleteProduct(){
        driver.findElement(dltcrt).click();
    }

    public void checkCart(){
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır." , driver.findElement(dltcntrl).getText());
    }
}
