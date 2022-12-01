package Gün12;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

public class _04_ScrollIntro extends BaseStaticDriver {
    /*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
    */
    public static void main(String[] args) {
           driver.get("https://triplebyte.com/");


        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımladı.
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1500)");
        // Sayfayı sağa x kadar ve aşağı y kaydırır (x,y)
        // 1500 px kadar aşağıya kaydıracak.

        Bekle(2);
        js.executeScript("window.scrollBy(0,-1500)");
        // Sayfayı tekrardan yukarı kaydırır.

        BekleKapat();

    }
}
