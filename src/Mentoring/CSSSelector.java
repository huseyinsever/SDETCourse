package Mentoring;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSSelector extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.akakce.com/");
        Bekle(1);
        WebElement AnaSayfa = driver.findElement(By.cssSelector("[id='H_l_v8']"));
        Assert.assertEquals("Akakce.com", AnaSayfa.getText());

        Bekle(1);
        WebElement HesapACbutonu = driver.findElement(By.cssSelector("[href='https://www.akakce.com/akakcem/giris/?m=1&s=1']"));
        HesapACbutonu.click();
        Bekle(1);
        WebElement ad = driver.findElement(By.cssSelector("[id='rnufn']"));
        ad.sendKeys("hüseyin");
        Bekle(1);
        WebElement soyad = driver.findElement(By.cssSelector("[id='rnufs']"));
        soyad.sendKeys("sever");
        Bekle(1);
        WebElement Eposta = driver.findElement(By.cssSelector("[type='email'][id='rnufe1']"));
        Eposta.sendKeys("huseyinsever514@gmail.com");
        Bekle(1);
        WebElement EpostaTekrar = driver.findElement(By.cssSelector("[type='email'][id='rnufe2']"));
        EpostaTekrar.sendKeys("huseyinsever514@gmail.com");
        Bekle(1);
        WebElement sifre = driver.findElement(By.cssSelector("[type='password'][id='rnufp1']"));
        sifre.sendKeys("Asd12345");
        Bekle(1);
        WebElement sifreTekrar = driver.findElement(By.cssSelector("[type='password'][id='rnufp2']"));
        sifreTekrar.sendKeys("Asd12345");
        Bekle(1);
        WebElement Cinsiyet = driver.findElement(By.cssSelector("[type='radio'][id='rngm']"));
        Cinsiyet.click();
        Bekle(1);
        WebElement İl = driver.findElement(By.cssSelector("[id='locpr']>:nth-child(5)"));
        İl.click();
        Bekle(1);
        WebElement ilçe = driver.findElement(By.cssSelector("[id='locds']>:nth-child(23)"));
        ilçe.click();
        Bekle(1);
        WebElement gün = driver.findElement(By.cssSelector("[id='bd']>:nth-child(25)"));
        gün.click();
        Bekle(1);
        WebElement ay = driver.findElement(By.cssSelector("[id='bm']>:nth-child(7)"));
        ay.click();
        Bekle(1);
        WebElement yıl = driver.findElement(By.cssSelector("[id='by']>:nth-child(13)"));
        yıl.click();
        Bekle(1);
        WebElement kullanımsartı = driver.findElement(By.cssSelector("[id='rnufpca']"));
        kullanımsartı.click();
        Bekle(1);
        WebElement baskasart = driver.findElement(By.cssSelector("[id='rnufnee']"));
        baskasart.click();
        Bekle(1);
        WebElement HesapAc = driver.findElement(By.cssSelector("[id='rfb']"));
        HesapAc.click();
        Bekle(2);
        WebElement HesabiDogrula = driver.findElement(By.xpath("//*[text()='huseyinsever514@gmail.com Bu eposta adresi zaten kayıtlı. Lütfen giriş yapmayı deneyin.']"));
        Assert.assertEquals("huseyinsever514@gmail.com Bu eposta adresi zaten kayıtlı. Lütfen giriş yapmayı deneyin.", HesabiDogrula.getText());
        Bekle(2);
        WebElement TamamTıkla = driver.findElement(By.cssSelector("[class='bt_v8']>:nth-child(1)"));
        TamamTıkla.click();
        Bekle(2);
        WebElement GirişYap = driver.findElement(By.cssSelector("[value='Giriş yap'][type='button'][class='s']"));
        GirişYap.click();
        Bekle(2);
        WebElement eMailGiris = driver.findElement(By.cssSelector("[type='email'][name='life']"));
        eMailGiris.sendKeys("huseyinsever514@gmail.com");
        Bekle(2);
        WebElement sifreGiris = driver.findElement(By.cssSelector("[type='password'][name='lifp']"));
        sifreGiris.sendKeys("Asd12345");
        Bekle(2);
        WebElement ProfilGiris = driver.findElement(By.cssSelector("[type='submit'][class='s'][value='Giriş yap']"));
        ProfilGiris.click();
        Bekle(2);
        WebElement Profil = driver.findElement(By.xpath("//*[text()='Hüseyin']"));
        Profil.click();
        Bekle(2);
        WebElement Siparislerim = driver.findElement(By.xpath("//*[text()='Siparişlerim']"));
        Siparislerim.click();
        Bekle(2);
        WebElement SiparisYokYazısı = driver.findElement(By.xpath("//*[text()='Kayıtlı siparişiniz bulunmuyor.']"));
        Assert.assertEquals("Kayıtlı siparişiniz bulunmuyor.", SiparisYokYazısı.getText());
        Bekle(2);
        WebElement Profilac = driver.findElement(By.xpath("//*[text()='Hüseyin']"));
        Profilac.click();
        Bekle(2);
        WebElement mesajlarim = driver.findElement(By.xpath("//*[text()='Mesajlarım']"));
        mesajlarim.click();
        Bekle(2);
        WebElement mesajDogrulama = driver.findElement(By.xpath("//*[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertEquals("Listelenecek mesaj bulunamadı.", mesajDogrulama.getText());
        Bekle(2);
        WebElement Anasayfatıkla = driver.findElement(By.cssSelector("[title='Anasayfaya gitmek için tıklayın']"));
        Anasayfatıkla.click();
        Bekle(2);
        WebElement SıcakFırsatlar = driver.findElement(By.cssSelector("[title='Gerçek İndirimleri Takip Et, Sıcak Fırsatları Kaçırma!']>:nth-child(2)"));
        SıcakFırsatlar.click();
        Bekle(2);
        WebElement TümFiyatGör = driver.findElement(By.cssSelector("[class='tfg'][href='/ev-sarj-cihazi/en-ucuz-apple-20-w-usb-c-guc-adaptoru-mhje3tu-a-fiyati,930257133.html']"));
        TümFiyatGör.click();
        Bekle(2);
        WebElement SatıcıPuani = driver.findElement(By.xpath("//*[text()='Satıcı puanı']"));
        SatıcıPuani.click();

        Bekle(2);

        BekleKapat();


    }
}
