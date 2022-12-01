package Gün07;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");


        WebElement box=driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions akyiyonlar=new Actions(driver);

        Action aksiyon=akyiyonlar
                .moveToElement(box) // kutucuğa gittim
                .click()            // içine tıklattım
                .keyDown(Keys.SHIFT)// SHIFT Tuşuna bastım
                .sendKeys("a")      // kucuk a harfini gönderdim, fakat SHIFT basılı olduğu için A görülmeli
                .keyUp(Keys.SHIFT)  // SHIFT tuşuna elimizi kaldırıyoruz
                .sendKeys("hmet")   // Kalanı küçük harf
                .build();
        Bekle(2);
        aksiyon.perform();



        BekleKapat();






    }
}
