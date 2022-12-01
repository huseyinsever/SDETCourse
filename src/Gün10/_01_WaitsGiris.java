package Gün10;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class _01_WaitsGiris extends BaseStaticDriver {
  /*  Selenium Bekletme Konusu
    Thread.Sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

    Implicitly Wait :
    Tüm sayfadaki elemanlar için bir bekleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
    Bütüm elemanlar için geçerli.NoSuchElement hatası nı vermek için verilen süre kadar,  eleman bulunana kadar bekler.

            driver.manage().timeouts().implicitlyWait(dr);


    pageLoadTimeout :
            driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
 */
    public static void main(String[] args) {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        Duration drs= Duration.ofSeconds(30);
        driver.manage().timeouts().implicitlyWait(drs);

        WebElement button=driver.findElement(By.cssSelector("[onclick='timedText()']"));
        button.click();

        WebElement webDriver=driver.findElement(By.xpath("//*[text()='WebDriver']"));







        BekleKapat();

    }
}

