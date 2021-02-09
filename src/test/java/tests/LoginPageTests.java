package tests;

import collections.LoginPageCollection;
import collections.SearchCollection;
import pages.LoginPage;
import pages.SearchPage;
import pages.SelectProduct;
import org.junit.Assert;
import org.junit.Test;



public class LoginPageTests extends BasedClass{




    @Test
    public void test() {
             System.out.println("gittigidiyor.com adresine giriş yapılıyor ve kontrol ediliyor...");
        openBrowser(LoginPageCollection.homeUrl);
        Assert.assertEquals( "https://www.gittigidiyor.com/",driver.getCurrentUrl());
             System.out.println("Üye girişi yapılıyor ve kontrol ediliyor...");
        openBrowser(LoginPageCollection.loginUrl);
        new LoginPage(driver).loginIn(LoginPageCollection.userName , LoginPageCollection.password);
        SearchPage searchPage = new SearchPage(driver);
             System.out.println("Ürün aranıyor...");
        searchPage.searchProduct(SearchCollection.product);
             System.out.println("2. sayfaya geçiş yapılıyor ve kontrol ediliyor...");
        searchPage.nextPage();
        SelectProduct selectProduct = new SelectProduct(driver);
             System.out.println("Rastgele ürün seçiliyor...");
        selectProduct.randomProduct();
             System.out.println("Ürün sepete ekleniyor...");
        selectProduct.addtoCart();
             System.out.println("Sepete gidiliyor...");
        selectProduct.goCart();
             System.out.println("Sepetteki ürün sayısı 2'ye çıkartılıyor ve adedin 2 oldugu kontrol ediliyor...");
        selectProduct.addNewProduct();
        selectProduct.checkNumberofProduct();
             System.out.println("Sepetteki ürünler siliniyor ve kontrol ediliyor...");
        selectProduct.deleteProduct();
        selectProduct.checkCart();




    }


}
