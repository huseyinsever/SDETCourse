package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Ödev2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.applitools.com");
        Bekle(2);
        WebElement element=driver.findElement(By.id("username"));
        element.sendKeys("ttechno@gmail.com");
        Bekle(2);
        WebElement element2=driver.findElement(By.id("password"));
        element2.sendKeys("techno123.");
        Bekle(2);
        WebElement button=driver.findElement(By.className("btn-primary"));
        button.click();
        Bekle(2);

        WebElement msg=driver.findElement(By.id("time"));
        if (msg.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Mesaj Doğrulandi");
        else
            System.out.println("Hata!!!");

        BekleKapat();




    }
}
