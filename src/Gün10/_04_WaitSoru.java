package Gün10;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_WaitSoru extends BaseStaticDriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Cıkan uyarıyı kapatınız
5- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");
        Bekle(1);

        WebElement SamsungS6=driver.findElement(By.cssSelector("[href='prod.html?idp_=1'][class='hrefch']"));
        SamsungS6.click();

        WebElement SepeteEkle=driver.findElement(By.cssSelector("[onclick='addToCart(1)']"));
        SepeteEkle.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement ClickAnaSayfa=driver.findElement(By.cssSelector("[class='navbar-brand']"));
        ClickAnaSayfa.click();


        BekleKapat();


    }
}
