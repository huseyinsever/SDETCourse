package Gün13;

import Utilis.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydetme extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username=driver.findElement(By.cssSelector("[id='txtUsername']"));
        username.sendKeys("hüseyin");

        WebElement password=driver.findElement(By.cssSelector("[id='txtPassword']"));
        password.sendKeys("asd1234");

        WebElement button=driver.findElement(By.cssSelector("[id='btnLogin']"));
        button.click();

        List <WebElement> spanMessage=driver.findElements(By.id("spanMessage"));
        if (spanMessage.size()>0) { // Login olamadın hata ekran görüntüsünü saklayalım
            // Hata ekranının ScreenShot ını alalım
            System.out.println("Login Olamadı, Hata mesaji gözüktü");

            // Ekran görüntüsü alalım
            TakesScreenshot ts=(TakesScreenshot)driver; //                  1.Aşama Ekran görüntüsü alma değişkenini tanımladım.
            File HafızadakiHali=ts.getScreenshotAs(OutputType.FILE);//      2.Aşama Saklama tipi seçildi.(Dosya),vdata (Byte) seçilebilir.
            // HafızadakiHali -> dosya olarak(jpg,png,bmp) kaydedeceğiz.
            FileUtils.copyFile(HafızadakiHali, new File("ekranGoruntuleri/LoginKontrol.png"));

            //TODO:ÖDEV -> Buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
        }   // Mesela 202155225 gibi.


    }
}

