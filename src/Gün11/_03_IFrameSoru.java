package Gün11;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
    public static void main(String[] args) {
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // frame1
        WebElement input=driver.findElement(By.cssSelector("b[id='topic'] ~ input"));
        input.sendKeys("İspanya");

        driver.switchTo().frame(0); // frame1 in içinde frame 3 e geçiş yaptım
        WebElement checkBox=driver.findElement(By.cssSelector("[type='checkbox']"));
        checkBox.click();

        driver.switchTo().defaultContent();// Su anda direk anasayfaya geldim

        driver.switchTo().frame(1);// frame2 ye geçis yaptım
        WebElement menü=driver.findElement(By.cssSelector("[id='animals']"));
        Select ddmenü=new Select(menü); // drop down -> yani aşağıdaki
        ddmenü.selectByIndex(3);// 4.eleman yani 3 indexli eleman seçildi


        BekleKapat();

    }
    //  <body> // defaultContent
//
//    <ifram1 name="IFrame1">  0
//        <iframe  name="IFrame3"></irmae> 0
//    </irmae>
//
//    <ifram1  name="IFrame2"> 1
//    </irmae>
//
//</body>
}

