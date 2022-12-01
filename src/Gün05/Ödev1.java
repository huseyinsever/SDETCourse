package Gün05;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");
        Bekle(2);
        WebElement element=driver.findElement(By.xpath("//*[@placeholder='Enter your username']"));
        element.sendKeys("ttechno@gmail.com");
        Bekle(2);
        WebElement element2=driver.findElement(By.xpath("//*[@placeholder='Enter your password']"));
        element2.sendKeys("techno123.");
        Bekle(2);
        WebElement buttom=driver.findElement(By.xpath("//*[@id='log-in'] "));
        buttom.click();
        Bekle(2);
        WebElement text=driver.findElement(By.xpath("//*[text()='Your nearest branch closes in: 30m 5s']"));
        if (text.getText().contains("Your nearest branch closes in: 30m 5s"))
             System.out.println("Test Dogru");
        else
            System.out.println("Test Yanlis");


        BekleKapat();






    }
}
