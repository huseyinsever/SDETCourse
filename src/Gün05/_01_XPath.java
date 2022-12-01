package Gün05;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_XPath extends BaseStaticDriver {
        public static void main(String[] args) {
            driver.get("https://www.saucedemo.com/");
            Bekle(2);
            WebElement username=driver.findElement(By.cssSelector("[id='user-name'] "));
            username.sendKeys("standard_user");
            Bekle(2);
            WebElement password=driver.findElement(By.cssSelector("[id='password'] "));
            password.sendKeys("secret_sauce");
            Bekle(2);
            WebElement login=driver.findElement(By.cssSelector("[id='login-button']"));
            login.click();
            Bekle(2);

            WebElement SauceLabsBackpack=driver.findElement(By.cssSelector("[class='inventory_item_img'] [src='/static/media/sauce-backpack-1200x1500.34e7aa42.jpg'] "));
            SauceLabsBackpack.click();
            Bekle(2);
            WebElement sepetEkle=driver.findElement(By.cssSelector("[id='add-to-cart-sauce-labs-backpack']"));
            sepetEkle.click();
            Bekle(2);
            WebElement geridön=driver.findElement(By.cssSelector("[id='back-to-products']"));
            geridön.click();
            Bekle(2);
            WebElement SauceLabsBoltTShirt=driver.findElement(By.cssSelector("[alt='Sauce Labs Bolt T-Shirt']"));
            SauceLabsBoltTShirt.click();
            Bekle(2);
            WebElement sepetEkle2=driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-bolt-t-shirt']"));
            sepetEkle2.click();
            Bekle(2);
            WebElement sepetTıkla=driver.findElement(By.cssSelector("[class='shopping_cart_link']"));
            sepetTıkla.click();
            Bekle(2);
            WebElement checkout=driver.findElement(By.cssSelector("[data-test='checkout'][id='checkout']"));
            checkout.click();
            Bekle(2);
            WebElement firstname=driver.findElement(By.cssSelector("[id='first-name']"));
            firstname.sendKeys("hüseyin");
            Bekle(2);
            WebElement lastname=driver.findElement(By.cssSelector("[id='last-name']"));
            lastname.sendKeys("sever");
            Bekle(2);
            WebElement zipcode=driver.findElement(By.cssSelector("[id='postal-code']"));
            zipcode.sendKeys("35000");
            Bekle(2);
            WebElement continua=driver.findElement(By.cssSelector("[id='continue']"));
            continua.click();

            Bekle(2);
            List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

            double toplam=0;
            for(WebElement ücretler: ucretler) {
                System.out.println("e.getText() = " + ücretler.getText());
                toplam += Double.parseDouble(ücretler.getText().substring(1));
            }
            System.out.println("toplam = " + toplam);


            WebElement webAltToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
            System.out.println(webAltToplam.getText());
            double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
            System.out.println("altToplam = " + altToplam);

            Assert.assertTrue(toplam == altToplam);


            BekleKapat();








        }
}
