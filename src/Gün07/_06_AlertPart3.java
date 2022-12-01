package Gün07;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        Bekle(2);
        WebElement clickMe=driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickMe.click();
        Bekle(3);
        driver.switchTo().alert().sendKeys("huseyin");
        driver.switchTo().alert().accept(); // Alert kutucuğuna geçildi ve OK(TAMAM) butonuna basıldı.

        Bekle(3);
        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(txtActual.getText().contains("huseyin"));
        // Kapattığında sayfaya dönmüş oluyorsun


        BekleKapat();









    }
}
