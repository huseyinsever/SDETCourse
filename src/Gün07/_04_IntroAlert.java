package Gün07;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseStaticDriver {
    /*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switchTo().alert() bununla kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */

    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe=driver.findElement(By.cssSelector("[class='btn btn-default']"));
        clickMe.click();
        Bekle(2);
        driver.switchTo().alert().accept(); // Alert kutucuğuna geçildi ve TAMAM butonuna basıldı.


        // Kapattığında sayfaya dönmüş oluyorsun




        BekleKapat();
    }
}
