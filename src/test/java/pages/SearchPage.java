package pages;

import collections.SearchCollection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage {

    By srchprdct = By.name("k");
    By btnsrch = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[2]/button/span");
    By nxtpg = By.cssSelector("#best-match-right > div.pager.pt30.hidden-m.gg-d-24 > ul > li:nth-child(2) > a");


    private WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;

    }

    public void searchProduct(String product)  {
        driver.findElement(srchprdct).sendKeys(SearchCollection.product);
        driver.findElement(btnsrch).click();


    }
    public void nextPage(){
        WebElement myelement = driver.findElement(nxtpg);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myelement);
        driver.findElement(nxtpg).click();
        Assert.assertEquals("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2",driver.getCurrentUrl());

    }

}
