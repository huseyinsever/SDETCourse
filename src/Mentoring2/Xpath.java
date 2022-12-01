package Mentoring2;

import Utilis.BaseStaticDriver;
import io.netty.handler.stream.ChunkedStream;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ElementClickInterceptedException;
public class Xpath extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get(" https://www.google.com/");

        Bekle(2);
        WebElement search=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
        search.sendKeys("Media Markt");
        Bekle(2);
        WebElement searchbutton=driver.findElement(By.xpath("//*[@name='btnK']"));
        searchbutton.click();
        Bekle(2);
        WebElement siteTıkla=driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]"));
        siteTıkla.click();
        Bekle(2);
        WebElement hesabımButton=driver.findElement(By.xpath("//*[text()='Hesabım']"));
        hesabımButton.click();
        Bekle(2);
        WebElement uyeOl=driver.findElement(By.xpath("//*[@data-tracking='login']"));
        uyeOl.click();
        Bekle(7);
        WebElement isim=driver.findElement(By.xpath("//*[@name='firstName']"));
        isim.sendKeys("hüseyin");
        Bekle(1);
        WebElement soyİsim=driver.findElement(By.xpath("//*[@name='lastName']"));
        soyİsim.sendKeys("seker");
        Bekle(1);
        WebElement Cinsiyet=driver.findElement(By.xpath("//*[@value='Mr']"));
        Cinsiyet.click();
        Bekle(1);
        WebElement telefon=driver.findElement(By.xpath("//*[@name='phone2']"));
        telefon.sendKeys("5536753786");
        Bekle(1);
        WebElement eMail=driver.findElement(By.xpath("//*[@name='email1']"));
        eMail.sendKeys("huseyin.sever@outlook.com.tr");
        Bekle(1);
        WebElement sifre=driver.findElement(By.xpath("//*[@name='logonPassword']"));
        sifre.sendKeys("husnu3535");
        Bekle(1);
        WebElement sifreTekrarı=driver.findElement(By.xpath("//*[@name='logonPasswordVerify']"));
        sifreTekrarı.sendKeys("husnu3535");
        Bekle(1);
        WebElement KutuTıkla=driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        KutuTıkla.click();
        Bekle(2);
        WebElement alertkapat=driver.findElement(By.xpath("//*[text()='Anladım']"));
        alertkapat.click();
        Bekle(2);
        WebElement HemenUyeOl=driver.findElement(By.cssSelector("button[type='submit'][id='my-account-register-submit']"));
        HemenUyeOl.click();
        Bekle(4);
        WebElement mediaMarkt=driver.findElement(By.xpath("//*[@class='ms-logo__brand-name']"));
        mediaMarkt.click();
        Bekle(2);
        WebElement search2=driver.findElement(By.xpath("//*[@placeholder='Ne aramıştınız?']"));
        search2.sendKeys("Laptop");
        Bekle(2);
        WebElement search2Button=driver.findElement(By.xpath("//*[@class='ms-icon ms-icon--type_search ms-button2__only-icon']"));
        search2Button.click();
        Bekle(2);
        WebElement incele=driver.findElement(By.xpath("(//span[text()='İncele'])[1]"));
        incele.click();
        Bekle(2);
        WebElement resim3=driver.findElement(By.xpath("(//img[@src='//assets.mmsrg.com/isr/166325/c1/-/ASSET_MMS_94528403/fee_52_41_png/HUAWEI-Matebook-D15-Intel-Core-i5-1135G7-8GB-RAM-512GB-SSD-15.6%22-W11-Laptop-Gri'])"));
        resim3.click();
        Bekle(2);
        WebElement sepeteEkle=driver.findElement(By.xpath("//*[@id='pdp-add-to-cart']"));
        sepeteEkle.click();
        Bekle(1);
        WebElement huaweiYazıDogrlm=driver.findElement(By.xpath("(//a[@href='https://www.mediamarkt.com.tr/tr/product/_matebook-d15-%C4%B1ntel-core-i5-1135g7-8gb-ram-512gb-ssd-15-6-w11-laptop-gri-1221731.html'])[2]"));
        Assert.assertTrue(huaweiYazıDogrlm.isDisplayed());

        BekleKapat();



    }
}
