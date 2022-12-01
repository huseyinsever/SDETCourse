package Gün07;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_AlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe=driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        clickMe.click();
        Bekle(2);
        driver.switchTo().alert().dismiss(); // Alert kutucuğuna geçildi ve CANCEL(İPTAL) butonuna basıldı.


        // Kapattığında sayfaya dönmüş oluyorsun




        BekleKapat();

    }
}
